//https://leetcode.com/problems/lucky-numbers-in-a-matrix/
import java.util.ArrayList;
import java.util.List;

public class Lucky_Numbers_in_a_Matrix {
    public static void main(String[] args) {
//        int [][]matrix = {{3,7,8},
//                          {9,11,13},
//                          {15,16,17}};
//        int [][]matrix = {{1,10,4,2},
//                          {9,3,8,7},
//                          {15,16,17,12}};

        int [][]matrix = {{3,6},{7,1},{5,2},{4,8}};

        System.out.println(luckyNumbers(matrix));
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        boolean result;
        int ans = 0;
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            int col = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if(min>matrix[i][j]){
                    min = matrix[i][j];
                    col = j;
                }
            }
            result = findMaxinCol(matrix,min,col);
            if(result){
                ans = min;
            }
        }
        if(ans == 0){
            return list;
        }
        list.add(ans);
        return list;
    }
    public static boolean findMaxinCol(int[][] arr,int min,int col){
        int max = min;
        for (int i = 0; i < arr.length; i++) {
            if(min < arr[i][col]){
                return false;
            }
        }
        return true;
    }

}
