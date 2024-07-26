package org.prg;

public class Factorial {
    public static void main(String[] args) {
        int n = 10;
        long result = factorial(n);
        System.out.println("Factorial of " + n + ": " + result);
    }
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

