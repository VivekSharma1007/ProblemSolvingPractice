package Strings;

public class Palindrome {

    public static boolean isPalindrome(String str){

        int si = 0;
        int ei = str.length() - 1;

        while(si <= ei) {
            if(str.charAt(si) != str.charAt(ei)) {
                System.out.println("Not Palindrome");
                return false;
            }
            si++;
            ei--;
        }
        return true;
    }


    public static void main(String[] args) {
        String str = "racbar";
        System.out.println(isPalindrome(str));
    }
}
