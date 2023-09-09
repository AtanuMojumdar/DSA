class GreatestNumber {
    public static void main(String[] args) {
        int[] list = {40,30,80};
        System.out.println(greatestNum(list));
    }
    public static int greatestNum(int [] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

}