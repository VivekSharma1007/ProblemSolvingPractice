package Recursion;

public class PrintInDecreasing {

    public static void printDecrease(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printDecrease(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        printDecrease(n);

    }
}
