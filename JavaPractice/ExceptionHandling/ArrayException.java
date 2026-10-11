import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter index (0-4): ");
            int index = sc.nextInt();

            System.out.println("Value: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer index!");
        } finally {
            sc.close();
        }
    }
}