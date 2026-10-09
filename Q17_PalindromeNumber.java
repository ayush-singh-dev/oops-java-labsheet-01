import java.util.Scanner;

public class Q17_PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Negative numbers are not treated as palindromes here.");
        } else {
            int original = number;
            int reversed = 0;

            while (number > 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number /= 10;
            }

            if (reversed == original) {
                System.out.println(original + " is a palindrome.");
            } else {
                System.out.println(original + " is not a palindrome.");
            }
        }
        sc.close();
    }
}
