
import java.util.Scanner;

public class max {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the element : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter "+ size + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("your array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int ma = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > ma){
                ma = arr[i];
            }
        }
        System.out.println("\nThe max in the given array are " + ma);
    }
}
