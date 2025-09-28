import java.util.*;
public class arrmax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element in the array with the size of " + size);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = mymax(arr);
        System.out.println("The maximum element inthe array is "+ans);
    }
    static int mymax(int[] arr1){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            
            if(arr1[i] > max){
                max =arr1[i];
            }
        }
        return max;
    }
}
