import java.util.Scanner;
//Prime Number
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Restart");
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = obj.nextInt();
        int b = a;
        System.out.println("Square root of "+b+" is " +Math.sqrt(b));
        isprimenumber(b);
    }

    public static void isprimenumber(int n){
        boolean result = false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0){
                result = true;
                if(Math.sqrt(n) == i){
                    System.out.println(i);
                }
                else{
                System.out.println(i+ " "+n/i);
                }
            }
        }
        if(!result){
            System.out.println(n+" is a Prime Number");
        }
        else{
            System.out.println(n+" is not a Prime Number");
        }
    }

}
