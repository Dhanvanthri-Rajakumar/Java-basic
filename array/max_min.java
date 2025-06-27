//find the maximum and the minimum number in the array:-
import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the element in the in the size of " + size + " : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("The element in the array are is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println("\n-----------------------------------------------------------------------------------------------");
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("\nThe maximum value is : "+ max );
        System.out.println("\nthe minimum value is : "+ min);
    }
}
