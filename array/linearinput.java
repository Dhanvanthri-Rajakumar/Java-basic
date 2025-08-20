import java.util.Scanner;

public class linearinput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter all the element in the array with the size of "+ size);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to find");
        int target = sc.nextInt();
        int ans = linearsearch(arr, target);
        System.out.println("the given element is found in the "+ans + "th index");
    }
    static int linearsearch(int[] array , int original){
        if(array.length < 0){
            return -1 ;
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] == original){
                return i;
            }
        }
        return -1;

    }
}