import java.util.Arrays;

public class StartAndEnd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,7,7,7,8,9};
        int[]ans ={0,0};
        ans[0]=startAndEnd(arr,7,true);
        ans[1]=startAndEnd(arr,7,false);
        System.out.println(Arrays.toString(ans));

    }

    private static int startAndEnd(int[] arr,int target,boolean firstOcc) {
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<target){
                start = mid +1;
            } else if (arr[mid]>target) {
                end = mid-1;
            }
            else{
                ans = mid;
                if(firstOcc){
                    end = mid-1;
                }
                else{
                    start = mid +1;
                }
            }
        }
        return ans;
    }
}
