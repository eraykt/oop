package exam.abstractOrnek;

public class Cat extends Animal {

    boolean isBritish;

    public Cat(int legCount, boolean isBritish) {
        super(legCount);
        this.isBritish = isBritish;
    }

    public void Move() {
        System.out.println("kedi yuruyo");
    }

    @Override
    public void abs() {
        // TODO Auto-generated method stub

    }
}

class Dog extends Animal implements Swimable {

    boolean asiliMi;

    public Dog(int legCount, boolean asiliMi) {
        super(legCount);
        this.asiliMi = asiliMi;
    }

    @Override
    public void Swim() {
        System.out.println("dog is swimming");
    }

    @Override
    public void abs() {
        // TODO Auto-generated method stub

    }
}

class Duck extends Animal implements Swimable, Flyable {

    boolean cirkinMi;

    public Duck(int legCount, boolean cirkinMi) {
        super(legCount);
        this.cirkinMi = cirkinMi;
    }

    @Override
    public void Fly() {

    }

    @Override
    public void Swim() {

    }

    @Override
    public void abs() {
        // TODO Auto-generated method stub

    }

}
