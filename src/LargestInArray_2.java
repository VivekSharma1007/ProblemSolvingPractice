public class LargestInArray_2 {

    public static int largestInArray(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int arr[] = {5, 557, 9, 10, 11, 15, 21};
        int res = largestInArray(arr);
        System.out.println(res);  // TC O(n)
    }
}
