package homeworks.first;

public class Main {
    public static void main(String[] args) {
        Animal anim1 = new Animal("karabas", AnimalTypes.REPTILE);
        Animal anim2 = new Animal("mavis", AnimalTypes.BIRD);
        Animal anim3 = new Animal("sumsum", AnimalTypes.MAMMAL);
        Animal anim4 = new Animal("cappon", AnimalTypes.FISH);

        Animal[] animals = { anim1, anim2, anim3, anim4 };

        Zoo myZoo = new Zoo(animals);
        myZoo.printAnimals();
    }

}
