package Recursion;

public class CheckArraySorted {

    public static boolean isSorted(int arr[], int idx) {
        if(idx == arr.length - 1) {
            return true;
        }
        if(arr[idx] <= arr[idx + 1]) {
            return isSorted(arr, idx + 1);

        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 6, 18, 10};
        System.out.println(isSorted(arr, 0));
    }
}
