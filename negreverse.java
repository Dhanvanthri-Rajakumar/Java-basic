/// Reverse the number in negative and in the positive 
import java.util.Scanner;
class reverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 0;
        int originalnum = num;
        num = Math.abs(num);
        
        while(num > 0){
            int rem = num%10;
            num = num/10;
            ans = ans*10+rem;
        }  
        
        if (originalnum < 0){
            ans = -ans;
        }
        System.out.println(ans);
    }
}