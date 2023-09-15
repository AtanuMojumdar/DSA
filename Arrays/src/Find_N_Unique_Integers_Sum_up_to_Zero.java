//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
import java.util.Arrays;

public class Find_N_Unique_Integers_Sum_up_to_Zero {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(Arrays.toString(sumZero(n)));
    }
    public static int[] sumZero(int n) {
        int[] arr = new int[n];
        int count = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(count == n){
                arr[i] = sum * -1;
            }
            else{
                arr[i] = count;
                sum = sum + count;
                count = count + 1;
            }

        }
        return arr;
    }
}
