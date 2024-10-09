package Backtracking;

public class StringSubset {

    // total subset 2^n
    // TC = 2^n
    public static void subset(String str, String sb, int idx) {

        if(idx == str.length()) {
            System.out.println(sb);
            return;
        }

        // yes
        subset(str, sb+ str.charAt(idx), idx + 1);
        // no
        subset(str, sb, idx + 1);
    }

    public static void main(String[] args) {
        String str = "abc";

        subset(str, "",0);
    }
}
