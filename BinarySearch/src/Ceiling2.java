public class Ceiling2 {
    public static void main(String[] args) {
        int[] arr = {'c','d','e'};
        System.out.println(ceiling(arr,'e'));
    }

     public static int ceiling(int[] arr, char target) {
         int start = 0;
         int end = arr.length - 1;
         while (start <= end) {
             int mid = start + (end - start) / 2;
             if (arr[mid] > target) {
                 end = mid-1;
             }
             else{
                 start = mid + 1;
             }
         }
         return start % arr.length;
     }

}
