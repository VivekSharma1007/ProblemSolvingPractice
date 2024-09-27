package Recursion;

public class PowerN {

    // TC = O(n)
    public static int powerToX(int x, int n) {
        if(n == 1) {
            return x;
        }
        return x * powerToX(x, n - 1);
    }

    // TC = O(log n)
    public static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }
        if(n == 1) {
            return x;
        }
        if(n % 2 == 0) {
            return power(x, n/2) * power(x, n/2);
        }else{
            return x * power(x, n/2) * power(x, n/2);
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;

        System.out.println(powerToX(x, n));
        System.out.println(power(x, n));
    }
}
