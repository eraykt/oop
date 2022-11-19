package homeworks.first;

public class Animal {
    private String name;
    private AnimalTypes type;

    public Animal(String name, AnimalTypes type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name;
    }

}

enum AnimalTypes {
    MAMMAL,
    BIRD,
    REPTILE,
    FISH;
}