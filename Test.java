class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }

    void fetch() {
        System.out.println("Dog fetches");
    }
}

public class TestDowncasting {
    public static void main(String[] args) {
        Animal a = new Dog();  // Up-casting
        Dog d = (Dog) a;  // Down-casting
        d.fetch();
    }
}
