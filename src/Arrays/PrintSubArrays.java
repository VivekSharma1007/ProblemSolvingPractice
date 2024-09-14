package Arrays;

public class PrintSubArrays {


    //    starting from index one print one index then go to next indenx and print that too with first one(continous elements)
    public static void subArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {  // this loop will do that work say print all elements from index 1(i) to index 3(j)
                    System.out.print(arr[k]);
                }
                System.out.print("  ");
            }
            System.out.println("  ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};

        // continuous elements
        subArray(arr);     // n * (n + 1) / 2
    }
}


// output

//        2  24  246  2468  246810
//        4  46  468  46810
//        6  68  6810
//        8  810
//        10