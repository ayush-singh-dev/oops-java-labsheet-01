import java.util.Scanner;

public class Q16_IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter annual income: ");
        double income = sc.nextDouble();

        if (income < 0) {
            System.out.println("Income cannot be negative.");
        } else {
            double tax;
            if (income <= 250000) {
                tax = 0;
            } else if (income <= 500000) {
                tax = income * 0.05;
            } else if (income <= 1000000) {
                tax = income * 0.20;
            } else {
                tax = income * 0.30;
            }

            System.out.printf("Tax amount: ₹%.2f%n", tax);
            System.out.println("Note: This applies the listed rate to the entire income.");
        }
        sc.close();
    }
}
