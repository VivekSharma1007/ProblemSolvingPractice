public class TryingSomething {

    public static void main(String[] args) {
        String s1 = "test";
        String s2 = "strings";

        String s3 = s1 + s2;
        System.out.println(s3);

        String s4 = s1.concat(s2);
        System.out.println(s4);

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        String s5 = new String(s1);
        String s6 = s1;         // string pool

        System.out.println(s1 == s5);
        System.out.println(s1 == s6);


        String a1 = "stringValue";
        String a2 = new String();
        a2 = "stringValue";

        System.out.println(a1 == a2);

        a2 = a1;
        System.out.println(a1 == a2);
    }
}
