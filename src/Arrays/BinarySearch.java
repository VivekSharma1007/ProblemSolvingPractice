package Arrays;

import java.util.Scanner;

public class BinarySearch { // for binary search we need a sorted array

//    this will return the index of element
//    time complexity -> O(log n)
    public static int binarySearchMethod(int arr[], int key) {
//        declare one startIndex and endIndex and then find mid index
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while(startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;
            if(arr[mid] == key) {       // if value at mid is key then return otherwise update start index and end index
                return mid;
            }
            else if(arr[mid] > key){
                endIndex = mid - 1;
            }
            else{
                startIndex = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14};
        Scanner cin = new Scanner(System.in);
        int key = cin.nextInt();
        int index = binarySearchMethod(arr, key);
        System.out.println(index);
    }
}
