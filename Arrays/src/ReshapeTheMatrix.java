import java.util.Arrays;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int [][]mat = {{1,2},{3,4}};
        System.out.println(Arrays.deepToString(matrixReshape(mat,1,4)));
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int [][] arr = new int[r][c];
        int output_rows = 0;
        int output_cols = 0;

        if((r*c != mat.length * mat[0].length)) return mat;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                arr[output_rows][output_cols] = mat[i][j];
                output_cols++;

                if(output_cols == c){
                    output_cols = 0;
                    output_rows++;
                }
            }
        }

        return arr;
    }
}
