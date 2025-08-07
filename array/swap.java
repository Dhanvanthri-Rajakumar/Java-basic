
import java.util.Arrays;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element in the array with the size of : "+size);
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before the swap : " + Arrays.toString(arr));
        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
        

        System.out.println("Array after the swap : " + Arrays.toString(arr));
    }
}
