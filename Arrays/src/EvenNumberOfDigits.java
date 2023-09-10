//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int [] arr = {12,345,2,6,-7896};
//        int [] arr= {555,901,482,1771};
        System.out.println(findEvenNumberOfDigits(arr));
//        System.out.println(findNumberOfDigits(0));
    }

     static int findEvenNumberOfDigits(int[] arr) {
        int count = 0;
        if(arr.length == 0){
            return -1;
        }

         for (int i : arr) {
             int numberOfDigits = findNumberOfDigits(i);
             if (numberOfDigits % 2 == 0) {
                 count++;
             }
         }

        return count;
    }

     static int findNumberOfDigits(int n) {
        if(n < 0) n = n*-1;
        if(n == 0) return 1;

        int count = 0;

        while(n>0){
            n = n/10;
            count++;
        }

        return count;
    }

}
