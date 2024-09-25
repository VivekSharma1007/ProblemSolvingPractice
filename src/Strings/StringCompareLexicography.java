package Strings;

public class StringCompareLexicography {
    public static void main(String[] args) {
        String arr[] = {"Apple", "Mango", "Banana"};

        String largest = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(largest.compareToIgnoreCase(arr[i]) < 0) {
                largest = arr[i];
            }
        }

        System.out.println(largest);
    }
}
