
import java.util.Arrays;
import java.util.Scanner;

public class sumofpositiveandnegative {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the element in the array with the size of : "+size);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                sum += arr[i];
            }
            if(arr[i] > 0){
                sum1 += arr[i];
            }
        }
        System.out.println("The sum of the negative in the array is : " + sum);
        System.out.println("The sum of the positive in the array is : " + sum1);
    }
}
