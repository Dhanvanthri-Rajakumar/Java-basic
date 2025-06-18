import java.util.Scanner;
class loop1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("------------------------");
        for(int num = 1 ; num <= n ; num++){
            System.out.println(num);
        }

    }
}