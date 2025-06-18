import java.util.Scanner;
class calculator{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.print("Enter the operator");
            char op = scan.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter the two number:");
                int num1 = scan.nextInt();
                int num2 = scan.nextInt();

                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    if(num2 != 0){
                    ans = num1 / num2;
                    }
                }
                if(op == '%'){
                    ans = num1 % num2;
                }

            }else if (op == 'X' || op == 'x'){
                break;
            }else{
                System.out.println("Invalid operation");
            }
            System.out.println("Answer:" + ans);
        }
    }
}
