package Strings;

public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        str = "abvc";

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length();) {
            char ch = str.charAt(i);
            int idx = i;
            int count = 0;
            while(idx < str.length() && str.charAt(idx) == ch) {
                count++;
                idx++;
                i++;
            }
            sb.append(ch);
            if(count > 1) {
                sb.append(count);
            }
        }

        System.out.println(sb.toString());
    }
}
