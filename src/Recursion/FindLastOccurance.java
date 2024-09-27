package Recursion;

public class FindLastOccurance {

    public static int find(int arr[], int key, int idx) {
        if(idx < 0) {
            return -1;
        }
        if(arr[idx] == key) {
            return idx;
        }
        return find(arr, key, idx - 1);
    }

    public static void main(String[] args) {
        int key = 5;
        int arr[] = {8, 3, 5, 9, 5, 10, 2, 5, 3};
        System.out.println(find(arr, key, arr.length - 1));
    }
}
