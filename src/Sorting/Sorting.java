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

    // pick an element from  unsorted part and place in the right pos in sorted array.
    public static void insertionSort(int arr[]) {
        for(int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding the correct position to insert
            while(prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];  // when we find that prev element is larger than the current element
                // we are moving the previous element to the next place to keep the place for insertion
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
        }
        print("Insertion Sort ", arr);
    }

    // count sort
    public static void countSort(int arr[]) {
        // frequency array
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        int count[] = new int[maxValue + 1];
        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int arrIndex = 0;
        for(int i = 0; i < count.length; i++) {
            while(count[i] > 0) {
                arr[arrIndex] = i;
                arrIndex++;
                count[i]--;
            }
        }

        print("CountSort", arr);
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
        insertionSort(arr);
        int arr2[] = {1, 4, 1, 3, 2, 4, 3, 7};
        countSort(arr2);


    }
}
