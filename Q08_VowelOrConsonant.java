import java.util.Scanner;

public class Q08_VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet character: ");
        char ch = Character.toLowerCase(sc.next().charAt(0));

        if (ch < 'a' || ch > 'z') {
            System.out.println("Input is not an alphabet.");
        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
        sc.close();
    }
}
