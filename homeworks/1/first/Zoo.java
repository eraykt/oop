package homeworks.first;

public class Zoo {
    public Animal[] animals;

    public Zoo(Animal[] animals) {
        this.animals = animals;
    }

    public void printAnimals() {
        for (Animal anim : animals) {
            System.out.println(anim);
        }
    }
}
