package Recursion;

public class FriendsPairing {

    public static int friendPair(int n) {
        if(n == 1 || n == 2) {
            return n;
        }
        int fnm1 = friendPair(n - 1);
              // no of ways to pair    // total ways left for choices
        int fnm2 = (n - 1) * friendPair(n - 2);

        return fnm1 + fnm2;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(friendPair(n));
    }
}
