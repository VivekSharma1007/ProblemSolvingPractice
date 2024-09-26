package Recursion;

public class FactorialCalc {

    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int factorialLoop(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
        System.out.println(factorialLoop(5));
    }
}