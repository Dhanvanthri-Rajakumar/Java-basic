//Find the minimum element in the array
import java.util.Scanner;

public class min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("\nEnter all the "+size+" element:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("All the element in the array are :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        }
        System.out.println("\n______________________________________________________________________________________________");
        int mi = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(mi > arr[i]){
                mi = arr[i];
            }
        }
        System.out.println("\nThe minimum number in the array are : " + mi);

    }
}
