public class ArmStrongNumber {
    public static void main(String[] args) {
        System.out.println("Armstrong Numbers");
        for (int i = 100; i < 1000; i++) {
            if(checkArmstrong((i))){
                System.out.print(i+ " ");
            }
        }
    }
    static boolean checkArmstrong(int n){
        int original = n;
        int sum = 0;
        while (n>0) {
            int rem = n % 10;
            rem = rem * rem * rem;
            sum = sum + rem;
            n = n / 10;
        }
        return original == sum;
    }

}
