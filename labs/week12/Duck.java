package labs.week12;

public class Duck extends Animal implements Swimmable, Flyable {

    @Override
    public void fly() {
        System.out.println("flyn");
    }

    @Override
    public void swim() {
        System.out.println("swimin");
    }

}
