public class PrefixSum {

    public static void prefixArraySum(int arr[]) {
        int prefixSumArray[] = new int[arr.length];
        prefixSumArray[0] = arr[0];
//      we are adding the sum of current element and complete overall sum till current element - 1
        for(int i = 1; i < arr.length; i++) {
//                      sum till current element - 1 + current element
            prefixSumArray[i] = prefixSumArray[i - 1] + arr[i];
        }

//        printing prefix array
        for(int a : prefixSumArray) {
            System.out.print(a + " ") ;
        }
        System.out.println();

        int maxSum = Integer.MIN_VALUE;
//        now after the prefix array, we need to traverse the array to get subarrays
        for(int start = 0; start < prefixSumArray.length; start++) {
            int currentSum = prefixSumArray[start];
            for(int end = start; end < prefixSumArray.length; end++) {
                // iss particular section par end wala element and start wala element ka difference jo hoga wo inn dono index(including) ka subarray sum hoga
                // bcz prefix[end] is basically a sum of all elements till end index(including) and prefix[start] is sum of all elements till index start(including)
                 int sum = prefixSumArray[end] - prefixSumArray[start];
                 if(sum > currentSum) {
                     currentSum = sum;
                 }
            }
            if(currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
//        int arr[] = {1, -2, 6, -1, 3};
//        int arr[] = {2, -1, -3, -4, 10};
          int arr[] = {6, -2, 7, -4, -8, 1, 7, -1, 6};

        prefixArraySum(arr);
    }
}
