//find the second min value in the array
import java.util.Arrays;
import java.util.Scanner;

public class secondmin1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the element in the array with the size if "+ size +" : 4");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Arrays : ");
        System.out.print(Arrays.toString(arr));
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        int secondmin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != min && arr[i] < secondmin){
                secondmin = arr[i];
            }
        }
        if(secondmin == Integer.MAX_VALUE){
            System.out.println("\nthe given array is invalid or all the element in the array are same");
        }else{
            System.out.println("\nThe minimum element is : " + min);
            System.out.println("\nThe second minimum element is : " + secondmin);
        }
    }   
}
