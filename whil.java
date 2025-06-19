
import java.util.Scanner;

public class whil{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        int a = 1;
        while(a <= i){
            System.out.println("the number is : " + a);
            a++;
        }
    }
}