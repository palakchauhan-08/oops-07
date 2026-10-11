package demo;

public class AccessDemo {
    public int publicValue = 10;
    protected int protectedValue = 20;
    int defaultValue = 30;
    private int privateValue = 40;

    public void displayPrivate() {
        System.out.println(privateValue);
    }
}