import java.util.Scanner;

public class CountOccurence {
    public static void main(String[] args) {
        System.out.println("Enter: ");
        Scanner x1 = new Scanner(System.in);
        int a = x1.nextInt();

        System.out.println("Number: ");
        int n = x1.nextInt();

        int count = 0;
        while(a > 0){
            int rem = a%10;
            if(rem == n){
                count++;
            }
            a = a/10;
        }
        System.out.println(count);

    }
}
