
import java.util.*;
public class secondmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size  = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("\nEnter the element in the array with the size of "+size +" : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The element in the array are : ");
        System.out.print(Arrays.toString(arr));

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        int secondmax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != max && arr[i] > secondmax){
            secondmax = arr[i];
        }
    }
    if (secondmax == Integer.MIN_VALUE){
        System.out.println("The given value is Invalid or all the values are same");
    }else{
        System.out.println("\nThe maximum value is : " + max);
        System.out.println("\nThe second maximum value is : " + secondmax);
    }
}
}
