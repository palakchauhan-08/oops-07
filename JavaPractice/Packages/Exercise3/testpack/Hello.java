package testpack;

public class Hello {
    public void display() {
        System.out.println("Public class accessed");
    }
}

class Secret {
    public void show() {
        System.out.println("Default-access class");
    }
}