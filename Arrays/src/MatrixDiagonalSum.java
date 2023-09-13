//https://leetcode.com/problems/matrix-diagonal-sum/
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat =
                {{1,2,3},
                 {4,5,6},
                 {7,8,9}};
        System.out.println(diagonalSum(mat));
    }
    public static int diagonalSum(int[][] mat) {
        int firstsum = 0;
        int secondsum = 0;
        for (int i = 0; i < mat.length; i++) {
            int first = mat[i][i];
            firstsum = firstsum + first;
            int second = mat[i][mat.length-1-i];
            secondsum = secondsum + second;
        }
        if(mat.length%2== 0){
            return  firstsum+secondsum;
        }
        int middle = mat.length/2;
        middle = mat[middle][middle];
        return firstsum+secondsum-middle;
    }
}
