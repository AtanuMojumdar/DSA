//https://leetcode.com/problems/shuffle-the-array/submissions/
import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7}; //[2,3,5,4,1,7]
        int n = 3;
//        shuffle(nums,n);
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int count = 0;
        int index = 0;
        while (count<ans.length/2){
            ans[index] = nums[count];
            ans[index+1] = nums[count+n];
            index = index + 2;
            count++;
        }
        return ans;
    }
}
