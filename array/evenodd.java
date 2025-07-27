
import java.util.Arrays;
import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int eve = 0;
        int od = 0;
        int evencount = 0;
        int oddcount = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                eve = arr[i];
                evencount++;
                System.out.println(eve+ " It is an even " );
            }else if(arr[i]%2 != 0){
                od = arr[i];
                oddcount++;
                System.out.println(od +" It is an odd ");
            }
            
        }
        System.out.println("The total numner of even number in the given array is : " + evencount);
        System.out.println("The total numner of odd number in the given array is : " + oddcount);
    }
}

