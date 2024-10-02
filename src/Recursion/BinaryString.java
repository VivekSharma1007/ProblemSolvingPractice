package Recursion;

public class BinaryString {

    public static void binaryStringPrint(String str, int idx, int lastPlace, StringBuilder sb) {

        if (idx == str.length()) {
            System.out.println(sb);
            return;
        }

        char ch = str.charAt(idx);
        if (lastPlace == 0) {
            sb.append(ch);
            binaryStringPrint(str, idx + 1, Integer.parseInt(ch + ""), sb);
        } else {
            if (ch == '1') {
                binaryStringPrint(str, idx + 1, 1, sb);
            } else {
                sb.append(ch);
                binaryStringPrint(str, idx + 1, 0, sb);
            }
        }


    }

    public static void printForN(int n, int lastPlace, String str) {

        if(n == 0) {
            System.out.println(str);
            return;
        }

        printForN(n - 1, 0, str+"0");
        if (lastPlace == 0) {
            printForN(n - 1, 1, str+"1");
        }
    }

    public static void main(String[] args) {
        String str = "10001110101110";
        binaryStringPrint(str, 0, 0, new StringBuilder());
        printForN(3, 0, new String());
    }
}
