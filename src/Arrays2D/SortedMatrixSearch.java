package Arrays2D;

import java.util.Scanner;

public class SortedMatrixSearch {

    public static void main(String[] args) {
        int arr[][] = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
        Scanner cin = new Scanner(System.in);
        int key = cin.nextInt();
        int rowIndex = 0;
        int colIndex = arr[0].length - 1;

        while(rowIndex < arr.length && colIndex >= 0){
            if(arr[rowIndex][colIndex] == key) {
                System.out.println(rowIndex + ", " + colIndex);
                break;
            }
            else if(arr[rowIndex][colIndex] > key) {
                 colIndex--;
            }
            else {
                rowIndex++;
            }
        }
    }

}
