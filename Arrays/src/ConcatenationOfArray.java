//https://leetcode.com/problems/concatenation-of-array/submissions/
import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
//        int[] nums = {1,2,1};
        int[] nums =  {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    public static int[] getConcatenation(int[] nums) {
        int [] ans = new int[nums.length * 2];

        for (int index = 0; index < ans.length; index++) {
            if(index >= nums.length){
                ans[index] = nums[index-nums.length];
            }
            else{
            ans[index] = nums[index];
            }
        }

        return  ans;
    }
}
