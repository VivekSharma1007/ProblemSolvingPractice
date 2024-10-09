package Sorting;

public class SortedRotatedArray {

    public static int search(int arr[], int target, int si, int ei) {
        if(si >= ei) {
            return -1;
        }

        int mid = (si + ei) / 2;
        if(arr[mid] == target) {
            return mid;
        }

        // on line 1
        if(arr[si] <= arr[mid]) {
            if(arr[si] <= target && target <= arr[mid]) { // left
                return search(arr, target, si, mid - 1);
            } else {       // right
                return search(arr, target, mid + 1, ei);
            }
        }
        // on line b
        else {
                if(arr[mid] <= target && target <= arr[ei]) {  // right
                    return search(arr, target, mid + 1, ei);
                }
                else {   // left
                    return search(arr, target, si, mid - 1);
                }
        }

    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 0, 1, 2};


        System.out.println(search(arr, 1, 0, arr.length - 1));
    }
}
