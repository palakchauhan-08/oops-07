import java.io.IOException;

public class ThrowsDemo {
    // Demonstrating the 'throws' keyword to declare that this method may throw a checked exception
    static void checkEligibility(int marks) throws IOException {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100. Provided: " + marks);
        }
        if (marks < 40) {
            throw new IOException("Marks below passing threshold (40): " + marks);
        }
        System.out.println("Eligibility confirmed with marks: " + marks);
    }

    public static void main(String[] args) {
        // Valid case
        try {
            checkEligibility(75);
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }

        // Case demonstrating throws propagation of checked IOException
        try {
            checkEligibility(35);
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } finally {
            System.out.println("ThrowsDemo execution completed.");
        }
    }
}
