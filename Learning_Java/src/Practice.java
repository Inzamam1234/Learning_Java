import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
//        SUM OF TWO NUMBERS
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter Fisrt Number : ");
//        int num1 = input.nextInt();
//        System.out.print("Enter the second number : ");
//        int num2 = input.nextInt();
//        int sum = num1 + num2;
//        System.out.println("Addition of these numbers are :" + " " + sum);

//        LARGEST OF THREE NUMBERS

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max =c;
        }
        System.out.println(max);






    }
}
