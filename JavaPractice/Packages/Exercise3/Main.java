import testpack.Hello;
// Intentionally invalid import demonstrating inaccessible default-access class:
// import testpack.Secret; // Compilation error: testpack.Secret is not public in testpack; cannot be accessed from outside package

public class Main {
    public static void main(String[] args) {
        Hello obj = new Hello();
        obj.display();

        // Intentionally invalid instantiation demonstrating package-private access control:
        // Secret s = new Secret(); // Compilation error: testpack.Secret is not public in testpack; cannot be accessed from outside package
    }
}