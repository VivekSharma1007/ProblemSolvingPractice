package Arrays;

public class ReverseArray {

    public static void reverseArray(int arr[]) {
        int si = 0;
        int ei = arr.length - 1;
//       reverse the value of si and ei
//       update si by increasing and ei by decreasing
        while(si <= ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 8, 10};
        int arr2[] = {2, 4, 6, 8, 10, 12};

//        1st approach
//        declare a new array of same size, copy the content from the end of given array and then copy
//        the newly created array in the given one
//        TC - O(n)
//        SC - O(n)

//        2nd approach
        reverseArray(arr2);
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

}
