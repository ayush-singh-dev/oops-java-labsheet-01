import java.util.Scanner;

public class Q05_ExplicitTypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a floating-point number: ");
        double original = sc.nextDouble();

        int converted = (int) original;
        System.out.println("Original value: " + original);
        System.out.println("Converted integer value: " + converted);
        sc.close();
    }
}
