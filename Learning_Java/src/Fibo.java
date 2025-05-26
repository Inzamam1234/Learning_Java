import java.net.SocketOption;
import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        System.out.println("Enter a number for Fibonacci : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  // N th number we needed to find the fibonacci number
        int a = 0;  // first number
        int b = 1;  // second number

        int count = 2;  // initializing count as 2 because we already has 2 numbers before as 0,1

        while(count <= n) {
            int temp = b;           // making 'b'  as temp and adding the prev two numbers and making temp as 'a' again and continue as much as count
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);   // Printing the final number that is the required Fibo
    }
}
