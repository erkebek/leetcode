package level1;

public class FindPivotIndex {
    public static void main(String[] args) {
        System.out.println(new FindPivotIndex().pivotIndex(new int[]{1,7,3,6,5,6}));
    }

    public int pivotIndex(int[] nums) {
        int sumOfLeft = 0;
        for (int i = 0; i < nums.length; i++) {
            int sumOfRight = 0;
            for (int j = i + 1; j < nums.length; j++) {
                sumOfRight += nums[j];
            }
            if (sumOfLeft == sumOfRight) {
                return i;
            }
            sumOfLeft += nums[i];
        }
        return -1;
    }
}
