public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
        int[] arr = {5,4,3,2,1};
        System.out.println(orderAgnosticBinarySearch(arr,3));
    }
    public static int orderAgnosticBinarySearch(int[] arr,int target){
        boolean isAsc = arr[0]<arr[arr.length-1];
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid]<target){
                if(isAsc){
                start = mid + 1;
                }
                else{
                    end = mid -1;
                }
            }
            else{
                if(isAsc){
                    end = mid -1;
                }
                else{
                    start = mid + 1;
                }

            }
        }
        return -1;
    }

}
