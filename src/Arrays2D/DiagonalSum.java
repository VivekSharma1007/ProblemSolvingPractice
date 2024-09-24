package Arrays2D;

public class DiagonalSum {

    public static void main(String[] args) {
//        int arr[][] = {{1,2,3,4},{5,6,7,8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        // TC = O(n^2)
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                // primary diagonal
                if(i == j) {
                    sum += arr[i][j];
                    System.out.print(arr[i][j] + " ");
                }
                // secondary diagonal
                else if(j == arr.length - 1 - i) { // i + j == arr.length - 1
                    sum += arr[i][j];
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

        System.out.println();
//        // check for array is odd or even
//        if(arr.length % 2 != 0) {
//            // odd
//            sum = sum - arr[arr.length / 2][arr.length / 2];
//        }

        System.out.println("sum " + sum);

        int linearSum = 0;
        for(int i = 0; i < arr.length; i++) {
            // primary diagonal
            linearSum += arr[i][i];
            // secondary diagonal
            linearSum += arr[i][arr.length - 1 - i];
        }
        // check for array is odd or even
        if(arr.length % 2 != 0) {
            // odd
            linearSum = linearSum - arr[arr.length / 2][arr.length / 2];
        }
        System.out.println("linear sum " + linearSum);
    }
}
