
import java.util.Scanner;
import java.util.*;
public class ceiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = 50;
        int[] arr = { 10,20,30,40,50,60,70,80,90};
        int ans = search(arr, target);
        System.out.println("The target element was in the index " + ans);

    }
    static int search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end-start) / 2;
            if(target > arr[arr.length-1]){
                return -1;
            }
            if(isAsc){
                if(arr[mid] == target){
                    return mid;
                }
                if(arr[mid]>target){
                    end = mid-1;
                }   
                if(arr[mid]<target){
                    start = mid+1;
                }
            }else{
                if(arr[mid] == target){
                    return mid;
                }
                if(arr[mid]<target){
                    end = mid-1;
                }   
                if(arr[mid]>target){
                    start = mid+1;
                }

            }

        }
        return start;   
    }
}
