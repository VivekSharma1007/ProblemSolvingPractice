package Recursion;

public class TileProblem {

    public static int tilesCount(int n) {

        if(n < 0) {
            return 0;
        }

        if(n == 0 || n == 1) {
            return 1;
        }

        int way1 = tilesCount(n - 1);
        int way2 = tilesCount(n - 2);

        return way1 + way2;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(tilesCount(n));
    }
}
