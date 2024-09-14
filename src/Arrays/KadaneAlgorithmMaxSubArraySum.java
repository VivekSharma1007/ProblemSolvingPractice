package Arrays;

public class KadaneAlgorithmMaxSubArraySum {

//    according to kadane
//    +ve + +ve = +ve
//    large +ve + small -ve = +ve
//    small +Ve + large -ve = -ve

//    how this will work
//    we will take 2 variable currentSum and maxSum
//    currentSum will keep on adding until its +ve
//    we will be comparing values of currentSum and maxSum for all elements
    public static int kadanes(int arr[]) {

        boolean areAllNegative = true;

        for(int n : arr) {
            if(n >= 0) {
                areAllNegative = false;
                break;
            }
        }

        int maxSum = Integer.MIN_VALUE;

//        if all values are negative, we will just find the largest value in array
        if(areAllNegative) {
            for(int n : arr) {
                if(n > maxSum) {
                    maxSum = n;
                }
            }
            return maxSum;
        }


        int currentSum = 0;

        for(int i = 0; i < arr.length; i++) {
            int tempCurrentSum = currentSum + arr[i];
            if(tempCurrentSum >= 0) {
                currentSum = tempCurrentSum;
            }
            else {
                currentSum = 0;      // it means at this point the sub array sum is going to negative so till this elements we have total sum as -ve
            }
            if(currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }


    public static void main(String args[]) {
//        int arr[] = {-2, -3, 4, -1, -2, 1, 5};
//        int arr2[] = {-2, -3, 4, -1, -4, 1, 5};
        int arr[] = {-6, -4, -5, -7, -2, -3};


//        this will not work when all values are -ve
        System.out.println(kadanes(arr));
    }
}
