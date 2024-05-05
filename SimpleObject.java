public class SimpleObject {
    // Constructor
    public SimpleObject() {
        System.out.println("A SimpleObject has been created!");
    }
    SimpleObject(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        // Creating an instance of SimpleObject
        SimpleObject obj = new SimpleObject();
         SimpleObject obj1 = new SimpleObject("hello Ravi");
    }
}