import java.util.Scanner;
class largest {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int max = a;
        if (max < b){
            max = b;
        }
        if (max < c){
            max = c;
        }
        System.out.println("the largest value is "  + max);
    }
}

