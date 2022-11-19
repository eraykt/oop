package labs.week7;

public class Person {
    private static int number;
    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public Person(int id, String firstName, String lastName, int age) {
        number = id;
        this.id = number++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName) {
        this(number, firstName, lastName, 0);
    }

    public Person(int id) {
        this.id = id;
    }

    public Person() {
        this(number);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " id= " + id + " " + age;
    }

}

class MainC {
    public static void main(String[] args) {
        Person p1 = new Person(99, "eray", "karatas", 19);
        Person p2 = new Person("tolga", "tom");
        Person p3 = new Person(12);
        Person p4 = new Person();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
