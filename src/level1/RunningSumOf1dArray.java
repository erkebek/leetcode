package level1;

import java.util.Arrays;

public class RunningSumOf1dArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(new RunningSumOf1dArray().runningSum(nums)));
    }

    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sumOfPrevious = 0;
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] + sumOfPrevious;
            sumOfPrevious = result[i];
        }
        return result;
    }

}
