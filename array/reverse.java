
import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the element in the array with the size of : " +size);
        int i = 0;
        while(i < arr.length) {
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println("The array before the reverse : " +Arrays.toString(arr));

        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Array after the reverse : " + Arrays.toString(arr));
    }
}
