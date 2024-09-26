package Recursion;

public class Fibonacci {

    public static int fibo(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 1;
        }
        int nminus1 = fibo(n - 1);
        int nminus2 = fibo(n - 2);

        return nminus1 + nminus2;
    }

    public static void main(String[] args) {
        int n = 7;

        System.out.println(fibo(n));
    }

}
