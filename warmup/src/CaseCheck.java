import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner x1 = new Scanner(System.in);
        char ch = x1.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println(ch+" is LowerCase");
        }
        else{
            System.out.println("UpperCase");
        }
    }
}
