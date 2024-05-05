public class StaticTest {
    static int count = 0;
    
    static {
        System.out.println("Static block is executed before the main method.");
        count = 10;
    }

    static void displayCount() {
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        System.out.println("Accessing static variable count: " + count);
        displayCount();

        count++;
        count++;
        System.out.println("After incrementing, count: " + count);
        displayCount();
    }
}
