package Arrays;

public class MaxSubarraySum {

//    we are traversing and finding the subarray
//    with tha we are updating values of maxSum and currentSum
//    TC = O(n*3)
    public static void maxSumSubArray(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                int currentSum = 0;          // calculate the current value of this subArray
                for(int k = i; k <= j; k++) {        // 1, -1, 5
                    currentSum += arr[k];
                    if(currentSum > maxSum) {       // update the max value
                        maxSum = currentSum;
                    }
                }
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
//        int arr[] = {1, -2, 6, -1, 3};
//        int arr[] = {2, -1, -3, -4, 10};
//        int arr[] = {6, -2, 7, -4, -8, 1, 7, -1, 6};
          int arr[] = {-6, -4, -5, -7, -2, -3};

        maxSumSubArray(arr);
    }
}
