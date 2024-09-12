import java.util.Scanner;

public class LinearSearch_1 {

    public static int linearSearch(int[] arr, int key) {
        for(int i = 0; i < arr.length; i++) {  // just make a loop and find the element one by one
            if(key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {5, 7, 9, 10, 11, 15, 21};
        Scanner cin = new Scanner(System.in);
        int key = cin.nextInt();
        int res = linearSearch(arr, key); // time complexity will be O(n)
        System.out.println(res);
    }
}
