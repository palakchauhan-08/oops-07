public class AgeCheck {
    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException(
                "You must be at least 18 years old."
            );
        }

        System.out.println("You are eligible.");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}