package Sorting;

public class Sorting {

//  large element will go to the end of array by swapping with adjacent elements
//  TC = O(n*2)
    public static void bubbleSort(int arr[]) {
        for(int turn = 0; turn < arr.length; turn++) {
            for(int idx = 0; idx < arr.length - 1 - turn; idx++) {
                if(arr[idx] > arr[idx + 1]) {
                    int temp = arr[idx];
                    arr[idx] = arr[idx + 1];
                    arr[idx + 1] = temp;
                }
            }
        }

        print("BubbleSort" , arr);
    }


    //  we will pick smallest element and put it in the beginning
    public static void selectionSort(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
            int minValueIdx = i;
            for(int j = i + 1; j < arr.length; j++) {
//              selected min value in the array
                if(arr[j] < arr[minValueIdx]) {
                    minValueIdx = j;
                }
            }
//          swapped the min value after selecting the min value from array
            int temp = arr[minValueIdx];
            arr[minValueIdx] = arr[i];
            arr[i] = temp;
        }

        print("Selection Sort", arr);
    }

    public static void print(String str, int arr[]) {
        System.out.print(str + ": ");
        for(int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};

        bubbleSort(arr);
        selectionSort(arr);


    }
}
