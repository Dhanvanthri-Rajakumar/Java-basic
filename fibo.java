
import java.util.Scanner;

class Fibo{
    public static void main (String args[]){
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <=n){
            int temp = b;
            b = a+b;
            a = temp;
            count++;
        }

        System.out.println(b);
    }
}