//Find the whether the given three digit number is Armstrong or not
import java.util.Scanner;

public class armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(cal(num)){
            System.out.println(num + "The given number is amstrong");
        }
        else{
            System.out.println(num + "The given number is not an amstrong");
        }
    }
    static boolean  cal(int num) {
        int original = num;
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;     
            rev = rev+rem*rem*rem;       
            num = num / 10;             
        }
        return original == rev;
    }
}
