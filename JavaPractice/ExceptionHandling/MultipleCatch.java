import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            String s1 = sc.nextLine();

            System.out.print("Enter second number: ");
            String s2 = sc.nextLine();

            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);

            System.out.println("Result: " + (a / b));
        } catch (NumberFormatException e) {
            System.out.println("Error: Enter valid integers!");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            sc.close();
        }
    }
}