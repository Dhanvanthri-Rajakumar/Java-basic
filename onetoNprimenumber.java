
import java.util.Scanner;

public class onetoNprimenumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the nuumber : ");
        int num = sc.nextInt();
        if(num <= 0){
            System.out.println("Inavlid");
        }
        else{
            for (int i = 2; i < num; i++) {
                boolean isprime = true;

                for (int j = 2; j * j <= num; j++) {
                if(num % j == 0){
                    isprime = false;
                }else{
                    isprime = true;
                }
            }
            if(isprime == true){
                System.out.println("The given number is prime");
            }
            else{
                System.out.println("The given number is not a prime");
            }
        }

            
        }
    }
}
