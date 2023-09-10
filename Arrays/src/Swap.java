import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverseArray(int... arr){
        int s = 0;
        int e = arr.length-1;
        while(s<e){
            swap(arr,s,e);
            s++;
            e--;
        }
        System.out.println(s==e);
    }

    private static void swap(int[] arr, int i, int i1) {
        int  temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}