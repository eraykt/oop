package labs.week12;

public class Fish extends Animal implements Swimmable {

    @Override
    public void swim() {
        System.out.println("fish swims");
    }

}
