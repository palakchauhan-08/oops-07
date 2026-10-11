import demo.AccessDemo;

public class Main {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();

        // 1. public member is accessible from anywhere:
        System.out.println("Public value: " + obj.publicValue);

        // Intentionally invalid member accesses demonstrating access levels from outside package:
        // System.out.println(obj.protectedValue); // Compilation error: protectedValue has protected access in demo.AccessDemo (inaccessible without inheritance outside package)
        // System.out.println(obj.defaultValue);   // Compilation error: defaultValue is not public in demo.AccessDemo; cannot be accessed from outside package (package-private)
        // System.out.println(obj.privateValue);    // Compilation error: privateValue has private access in demo.AccessDemo (inaccessible outside declaring class)

        // 2. private member accessed indirectly via public method:
        System.out.print("Private value via public method: ");
        obj.displayPrivate();
    }
}