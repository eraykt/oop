package exam.abstractOrnek;

public class MainClass {
    public static void main(String[] args) {
        Cat a1 = new Cat(4, false);
        Dog a2 = new Dog(4, true);
        Duck a3 = new Duck(2, true);

        a1.Move();
        a2.Move();
        a3.Move();

        a2.Swim();
        a3.Swim();

        a3.Fly();
    }
}
