package Recursion;

public class PrintIncreasing {

    public static void printIncrease(int n) {
        if (n == 0) {
            return;
        }
        printIncrease(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 5;
        printIncrease(n);
    }
}
