
import java.util.Scanner;

public class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int original = num;

        int ans = 0;
        while(num > 0){
            int rem = num%10;
            num = num/10;
            ans = ans*10+rem;
        }
        if(original == ans){
            System.out.println("The given number is Palindrome");
        }else{
            System.out.println("The given number is not the palindrome");
        }
    }
}