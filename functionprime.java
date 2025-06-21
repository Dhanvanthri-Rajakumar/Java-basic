
//find the prime number in the function method
import java.util.Scanner;

public class functionprime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        if(isprime(number)){
            System.out.println("the given number is prime numer");
        }
        else {
            System.out.println("The given number is not a prime number");
        }

    }
    public static boolean isprime(int num){
        if (num<=0){
            System.out.println("The given number is Invalid");

        }for (int i = 2; i < num/2; i++) {
            if(num%i==0){
                return false;
            }
            
        }
        return true;

    }
}
