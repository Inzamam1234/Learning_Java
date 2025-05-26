import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;
        while (true){
            System.out.print("Enter the Operation : ");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' ||op == '*' || op == '%' || op == '/'){
                System.out.print("Enter the First Number : ");
                int num1 = in.nextInt();
                System.out.print("Enter the Second Number : ");
                int num2 = in.nextInt();

                if(op == '+'){
                    ans = num1 + num2;
                }

                if(op == '-'){
                    ans = num1 - num2;
                }

                if(op == '*'){
                    ans = num1 * num2;
                }

                if(op == '%'){
                    ans = num1 % num2;
                }

                if(op == '/'){
                    if(num2 != 0){
                        ans = num1 / num2;
                    }

                }
            }
            System.out.print("Answer Is : ");
            System.out.println(ans);

        }




    }
}
