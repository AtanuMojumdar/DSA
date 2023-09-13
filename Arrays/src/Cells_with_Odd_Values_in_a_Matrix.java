//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
public class Cells_with_Odd_Values_in_a_Matrix {
    public static void main(String[] args) {
//        int [][]indices = {{0,1},{1,1}};
//        int m = 2;
//        int n = 3;
        int [][]indices = {{1,1},{0,0}};
        int m = 2;
        int n = 2;
        System.out.println(oddCells(m,n,indices));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int [m][n];
        for(int[] arr: indices){
            int r = arr[0];
            incrementRow(ans,r,n);
            int c = arr[1];
            incrementCol(ans,c,m);
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(!(ans[i][j] % 2 == 0)){
                    count++;
                }
            }
        }
        return count;
    }
    public static void incrementRow(int[][] ans,int r,int n){
        for (int i = 0; i < n; i++) {
            ans[r][i]++;
        }
    }
    public static void incrementCol(int[][] ans,int c,int m){
        for (int i = 0; i < m; i++) {
            ans[i][c]++;
        }
    }


}
