package Arrays2D;

public class SpiralMatrix {

    public static void main(String[] args) {
        int arr[][] = {{1,2,3, 6}, {4,5,6, 5}, {7,8,9, 5}, {1,2,3,4}};

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int rowStart = 0;
        int rowEnd = arr.length - 1;
        int colStart = 0;
        int colEnd = arr[0].length - 1;

        while(rowStart <= rowEnd && colStart <= colEnd) {

            // top left to right
            for(int i = colStart; i <= colEnd; i++) {
                System.out.print(arr[rowStart][i] + " ");
            }

            // left top to bottom
            for(int i = rowStart + 1; i <= rowEnd; i++) {
                System.out.print(arr[i][colEnd] + " ");
            }

            // bottom right to left
            for(int i = colEnd - 1; i >= colStart; i--) {
                if(rowStart == rowEnd) {
                    break;
                }
                System.out.print(arr[rowEnd][i] + " ");
            }

            // left bottom to top
            for(int i = rowEnd - 1; i >= rowStart + 1; i--) {
                if(colStart == colEnd) {
                    break;
                }
                System.out.print(arr[i][colStart] + " ");
            }

            rowStart++;
            colEnd--;
            rowEnd--;
            colStart++;
        }

    }


}
