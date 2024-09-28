package Recursion;

public class DuplicateString {

    public static void removeDuplicate(String str, boolean arr[], int idx, StringBuilder sb) {
        if(idx == str.length()){
            System.out.println(sb);
            return;
        }

        char ch = str.charAt(idx);

        if(arr[ch - 'a'] == false) {
            sb.append(ch);
            arr[ch - 'a'] = true;
        }
        removeDuplicate(str, arr, idx + 1, sb);
    }

    public static void main(String[] args) {
        String str = "vivekksharma";
        boolean arr[] = new boolean[26];
        removeDuplicate(str, arr, 0, new StringBuilder(""));
    }
}
