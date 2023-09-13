import java.util.Arrays;

public class Flipping_an_Image {
    public static void main(String[] args) {
        int [][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int [][] image2 = image.clone();
        flipAndInvertImage(image);
        System.out.println(Arrays.deepToString(image));
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int [][] image2 = image.clone();
        for(int[] arr : image2){
            swap(arr);
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == 0){
                    arr[i] = 1;
                }
                else{
                    arr[i] = 0;
                }
            }
        }
        return image2;
    }
    public static void swap(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            swapArray(arr,start,end);
            start++;
            end--;
        }
    }
    public static void swapArray(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


}
