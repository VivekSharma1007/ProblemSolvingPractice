package Backtracking;

public class GridWays {

    public static int gridWay(int arr[][], int row, int col) {

        if(row >= arr.length || col >= arr[0].length) {
            return 0;
        }

        if(row == arr.length - 1 && col == arr[0].length - 1) {
            return 1;
        }

        int rightWay = gridWay(arr, row, col + 1);
        int downWay = gridWay(arr, row + 1, col);

        return rightWay + downWay;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;

        int arr[][] = new int[n][m];

        System.out.println(gridWay(arr, 0, 0));
    }

}
