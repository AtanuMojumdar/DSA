//https://leetcode.com/problems/build-array-from-permutation/
import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int [] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int index = 0; index < nums.length; index++) {
            ans[index] = nums[nums[index]];
        }

        return ans;
    }
}
