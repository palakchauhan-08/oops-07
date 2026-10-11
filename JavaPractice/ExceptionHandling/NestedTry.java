public class NestedTry {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        try {
            int a = 100;
            int b = 0;

            try {
                System.out.println("Array value: " + arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }

            System.out.println("Division: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}