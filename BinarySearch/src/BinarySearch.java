public class BinarySearch {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
        int [] arr = {5};
        System.out.println(binarySearch(arr,5));
    }
    public static int binarySearch(int[] nums,int target){ //O(log n)
        if(nums.length == 0) return -1;

        int start = 0;
        int end = nums.length-1;

        while (start<=end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid]<target){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }

        return -1;
    }
}