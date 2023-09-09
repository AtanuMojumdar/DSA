import java.util.Scanner;

public class FibonnaciNumbers {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        Scanner x1 = new Scanner(System.in);
        System.out.print("Enter: ");
        int n =  x1.nextInt();


        for (int i = 2; i <=n; i++) {
           int temp = b;
           b = a+b;
           a = temp;
        }
        if(n == 0){
            System.out.println("Result: "+ 0);
        }
        else{
            System.out.println("Result: "+ b);
        }
    }
}
