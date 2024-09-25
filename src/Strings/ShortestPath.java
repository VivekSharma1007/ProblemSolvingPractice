package Strings;

public class ShortestPath {
    public static void main(String[] args) {
        String path = "WNEENESENNN";


        int x = 0;
        int y = 0;
        for(int i = 0; i < path.length(); i++) {
            if(path.charAt(i) == 'N') {
                y++;
            } else if(path.charAt(i) == 'S') {
                y--;
            } else if(path.charAt(i) == 'W') {
                x--;
            } else {
                x++;
            }
        }

        x = x * x;
        y = y * y;

        double displacement = Math.sqrt(x + y);
        System.out.println(displacement);
    }
}
