public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("File opened");

            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("An exception occurred");
        } finally {
            System.out.println("Resource closed");
        }
    }
}