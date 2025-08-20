
import java.util.Scanner;

public class stringsearchinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string name : ");
        String str = sc.nextLine();
        System.out.println("Enter the element that we need to search : ");
        char ch = sc.next().charAt(0);
        boolean ans = stringsearch(str, ch);
        System.out.println(ans);
    }
    static boolean stringsearch(String name , char ca){
        if(name.length() <= 0 ){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ca){
                return true;
            }
        }
        return false;
    }
}
