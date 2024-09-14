package Arrays;

public class TrappingRainWater {

    public static int trappedWater(int height[]) {
//        we will find the max values of left and max values of right for current index(will create 2 arrays for that)
//        then min of both those max will be taken and
//        water trapped for that location is ( (min of those max values - current value(height[currentIndex]) ) * width,
//        width is given as 1 here

        int leftMaxArray[] = new int[height.length];
        int rightMaxArray[] = new int[height.length];

//        left max array will be filled from left and right max array will be filled from right
        leftMaxArray[0] = height[0];
        for(int i = 1; i < height.length; i++) {
            leftMaxArray[i] = Math.max(height[i], leftMaxArray[i - 1]);
        }

        rightMaxArray[rightMaxArray.length - 1] = height[height.length - 1];
        for(int i = height.length - 2; i >= 0; i--) {
            rightMaxArray[i] = Math.max(height[i], rightMaxArray[i + 1]);
        }

        int finalTrapperWater = 0;
//      (minValueFromMaxArrays - currentValue which is height[currentIndex]) * 1
//       min value is taken because till that height water will be hold after that it will spill
        for(int i = 0; i < height.length; i++) {
            finalTrapperWater += Math.min(leftMaxArray[i], rightMaxArray[i]) - height[i];
        }
        return finalTrapperWater;
    }

    public static void main(String[] args) {
//        given elements of height array are >= 0
//        if elements of array are marked as bar graph we have to find the area of water trapped in those bar
        int height[] = {4, 2, 0, 6, 3, 2, 5};

        System.out.println(trappedWater(height));
    }
}
