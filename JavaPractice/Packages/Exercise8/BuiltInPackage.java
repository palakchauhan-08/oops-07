import java.util.ArrayList;
import java.util.Scanner;

public class BuiltInPackage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("How many numbers? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            numbers.add(sc.nextInt());
        }

        System.out.println("Numbers: " + numbers);

        sc.close();
    }
}