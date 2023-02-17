package main.java.chapter1.subsection1;

public class Task_1_1_20 {

    //ln(N!)
    public int lnNfactorial(int n) {

    }

    public int factorial(int n) {
        if(n == 0 || n == 1) return 1;
        else return factorial(n - 1) * n;
    }
}
