import java.util.Scanner;

public class Q15_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int number = sc.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Please enter a positive three-digit number.");
        } else {
            int original = number;
            int sum = 0;

            while (number > 0) {
                int digit = number % 10;
                sum += digit * digit * digit;
                number /= 10;
            }

            if (sum == original) {
                System.out.println(original + " is an Armstrong number.");
            } else {
                System.out.println(original + " is not an Armstrong number.");
            }
        }
        sc.close();
    }
}
