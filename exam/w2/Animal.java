package exam.w2;

public class Animal {
    protected String color;

    void eat() {
        System.out.println("animal is eating");
    }
}

class Cat extends Animal {

    int age;

    @Override
    void eat() {
        System.out.println("kedi yiyo");
    }

    void miyav() {
        System.out.println("faruk miyavliyor");
    }
}

class MainClass {
    public static void main(String[] args) {
        Animal a = new Cat();
        // a.miyav(); 1. ariza
        ((Cat) a).miyav(); // ??
        Object o = new Animal();
        // o.eat(); 2. ariza
        // o.meow(); 3. ariza
        ((Animal) o).eat(); // ??
        // ((Animal) o).miyav(); 4. ariza
        // ((Cat) o).eat(); // ?? (*)
        ((Cat) o).miyav(); // ??
    }
}