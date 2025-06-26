
import java.util.Scanner;

public class add{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter" + size + "elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the elemment in the array are ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " " );
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum +arr[i];
        }
        System.out.println(" ");
        System.out.println("Enter the sum of all the element in the array is : " + sum);   
    }
}
