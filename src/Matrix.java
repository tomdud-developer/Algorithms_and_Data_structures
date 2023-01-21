public class Matrix {
    public static void main(String[] args) {
/*        drawMatrix(new int[][]{
                {1,29,93,44},
                {45,23,35,61},
                {45,62,33,11},
                {45,82,5,13},
        });
        System.out.println();
        drawMatrix(matrixTransposition(new int[][]{
                {1,29,93,44},
                {45,23,35,61},
                {45,62,33,11},
                {45,82,5,13},
        }));*/

        System.out.print(lg(10));
    }

    public static float lg(int N) {
        int c = 0;

        while(power(2, c) < N) {
            c++;
        }
        c -= 1;

        return c;
    }

    public static int power(int a, int b) {
        int pow = 1;
        for( int i = 0; i < b; i++) {
            pow *= a;
        }

        return pow;
    }
    public static int[][] matrixTransposition(int[][] matrix) {
        int [][] newMatrix = new int[matrix[0].length][matrix.length];
        for(int row = 0; row < matrix.length; row++)
            for(int col = 0; col < matrix[0].length; col++) {
                newMatrix[col][row] = matrix[row][col];
            }
        return newMatrix;
    }

    public static void drawMatrix(int[][] matrix) {
        int space = 0;
        for (int[] xx : matrix) {
            for (int x : xx) {
                if (String.valueOf(x).length() > space)
                    space = String.valueOf(x).length();
            }
        }
        space += 1;
        for (int row = -1; row < matrix.length; row++) {
            if(row > -1) System.out.print(row + 1);
            for (int s = 0; s < (row == -1 ? space : space - String.valueOf(row).length()); s++) System.out.print(" ");
            System.out.print("|");

            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print("|");
                if(row == -1) {
                    System.out.print(col + 1);
                    for (int s = 0; s < space - String.valueOf(col).length(); s++) System.out.print(" ");
                } else {
                    System.out.print(matrix[row][col]);
                    for (int s = 0; s < space - String.valueOf(matrix[row][col]).length(); s++) System.out.print(" ");
                }
            }
            System.out.println("");
            if(row == -1) {
                for (int s = 0; s < space * matrix[0].length + space + space + 1 + space; s++)
                    System.out.print("-");
                System.out.println("");
            }
        }
    }
}