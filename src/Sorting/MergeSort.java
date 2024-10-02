package Sorting;

public class MergeSort {

    public static void mergeSortFun(int arr[], int si, int ei) {
        if(si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2; // (si + ei) / 2
        mergeSortFun(arr, si, mid);
        mergeSortFun(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];

        int i = si;
        int j = mid + 1;
        int idx = 0;

        while(i <= mid && j <= ei) {
            if(arr[i] < arr[j]) {
                temp[idx] = arr[i];
                idx++;
                i++;
            }
            else {
                temp[idx] = arr[j];
                j++;
                idx++;
            }
        }

        while(i <= mid) {
            temp[idx] = arr[i];
            i++;
            idx++;
        }

        while(j <= ei) {
            temp[idx] = arr[j];
            j++;
            idx++;
        }

        for(i = si, idx = 0; idx < temp.length; idx++, i++) {
            arr[i] = temp[idx];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSortFun(arr, 0, arr.length - 1);
        for(int n : arr) {
            System.out.print(n + " ");
        }
    }
}
