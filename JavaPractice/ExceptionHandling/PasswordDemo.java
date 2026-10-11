class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class PasswordDemo {
    static void checkPassword(String password)
            throws InvalidPasswordException {

        if (password == null || password.length() < 6) {
            throw new InvalidPasswordException(
                "Password must contain at least 6 characters."
            );
        }

        System.out.println("Password accepted.");
    }

    public static void main(String[] args) {
        try {
            checkPassword("abc");
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}