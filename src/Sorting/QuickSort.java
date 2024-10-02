package Sorting;

public class QuickSort {

    public static void quickSortFun(int arr[], int si, int ei) {

        if(si >= ei) {
            return;
        }

        int pIdx = partition(arr, si, ei);
        quickSortFun(arr, si, pIdx - 1);
        quickSortFun(arr, pIdx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int iterator = si - 1;

        for(int i = si; i < ei; i++) {
            if(arr[i] <= pivot) {
                iterator++;
                int temp = arr[i];
                arr[i] = arr[iterator];
                arr[iterator] = temp;
            }
        }

        iterator++;
        arr[ei] = arr[iterator];
        arr[iterator] = pivot;

        return iterator;

    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        quickSortFun(arr, 0, arr.length - 1);
        for(int n : arr) {
            System.out.print(n + " ");
        }
    }
}
