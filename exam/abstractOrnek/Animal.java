package exam.abstractOrnek;

public abstract class Animal {
    protected int legCount;

    public Animal(int legCount) {
        this.legCount = legCount;
    }

    public void Move() {
        System.out.println("animal is moving");
    }

    public void Move(int speed) {
        System.out.println("moving but with" + speed + " km/h");
    }

    public abstract void abs();
}
