import java.util.Scanner;

public class Function {
    public static void main(String[] args) {

//        int answer = Sum_Of_Two_Numbers(12,2);
//        System.out.println(answer);

        System.out.print("Enter your Sweet Name : ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String welcoming = greeting(name);
        System.out.println(welcoming);
        }
    static int Sum_Of_Two_Numbers(int a, int b){
        int sum = a + b;
        return sum;
    }

    static String greeting(String name){
        String message = "Hello " + name;
        return message;

    }
}
