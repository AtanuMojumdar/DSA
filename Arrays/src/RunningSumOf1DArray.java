//https://leetcode.com/problems/running-sum-of-1d-array/
import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
       int [] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        for (int index = 0; index < nums.length; index++) {
            ans[index] = sum(nums,0,index);
        }
        return ans;
    }

    public static int sum(int[] nums, int start, int end) {
        int sum = 0;
        int count = start;
        while(count<=end){
            sum = sum + nums[count];
            count++;
        }
        return sum;
    }
}
