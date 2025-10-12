import java.util.*;

public class BinarySearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the target to find: ");
        int target = sc.nextInt();

        System.out.println("Enter the elements in the array (sorted order): ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = search(arr, target);

        if (ans == -1)
            System.out.println("Target not found in array.");
        else
            System.out.println("Target found at index: " + ans);
    }

    static int search(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;

            if (isAsc) {
                if (arr[mid] < target)
                    start = mid + 1;
                else
                    end = mid - 1;
            } else {
                if (arr[mid] > target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }

        return -1; 
    }
}
