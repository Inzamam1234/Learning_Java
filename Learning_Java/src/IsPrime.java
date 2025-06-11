import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
        }

        if (isPrime)
            System.out.println(num + " is a Prime Number.");
        else
            System.out.println(num + " is NOT a Prime Number.");
    }
}
