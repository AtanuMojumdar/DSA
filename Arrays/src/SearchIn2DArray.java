import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int target = 7;
        System.out.println(Arrays.toString(searchIn2DArray(arr,target)));
    }

     static int[] searchIn2DArray(int[][] arr, int target) {
         if(arr.length == 0){
            return new int[] {-1,-1};
        }

         for (int row = 0; row < arr.length; row++) {
             for (int col = 0; col < arr[row].length; col++) {
                 if(arr[row][col] == target){
                     return new int[] {row,col};
                 }
             }
         }

        return new int[] {-1,-1};
    }

}
