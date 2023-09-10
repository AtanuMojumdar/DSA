//https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomerWealth {
    public static void main(String[] args) {
//        int [][] accounts = {{1,5},{7,3},{3,5}};
        int [][] accounts= {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(findRichestCustomer(accounts));
    }

     static int findRichestCustomer(int[][] acccounts) {
        if(acccounts.length == 0) return -1;
        int max = 0;
        for(int[] customer : acccounts){
            int wealth = findWealth(customer);
            if(max < wealth){
                max = wealth;
            }
        }

        return max;
    }

     static int findWealth(int[] arr) {
        int value = 0;
        if(arr.length == 0) return value;
        for(int i: arr){
            value = value + i;
        }
        return  value;
    }
}
