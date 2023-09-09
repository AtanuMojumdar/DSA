import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args) {
        Scanner x1 = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = x1.nextInt();

        int answer = 0;
        while(num > 0){
            int rem = num%10;
            answer = answer * 10 + rem;
            num = num/10;
        }

        System.out.println(answer);
    }
}