package exam.w2;

import java.util.Scanner;

public class InheritanceOrnek {
    public static void main(String[] args) {
        // Person a1 = new Person("eray", 1);
        // Muhendis a2 = new Muhendis("eray", 2, 10f);
        // BilgisayarMuhendisi a3 = new BilgisayarMuhendisi("eray", 31, 124, "c#");

        // a2.merhaba();

        // a3.merhaba();

        // Muhendis muhendisObje = a3;
        // muhendisObje.merhaba();
        // System.out.println(muhendisObje);

        // Muhendis obje2 = new BilgisayarMuhendisi("null", 12, 12, "@a");
        // // obje2.asd();
        // obje2.merhaba();

        Muhendis bMuhendisi = new Muhendis("null", 12, 12);

        bMuhendisi.merhaba();
    }
}

abstract class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void merhaba() {
        System.out.println("ben bir insanim");
    }
}

class Muhendis extends Person {

    double maas;

    public Muhendis(String name, int age, double maas) {
        super(name, age);
        this.maas = maas;
    }

    public Muhendis(double maas) {
        this(null, 0, 14.2f);
    }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // String name;
    // int age;
    // double maas;

    // try {
    // name = sc.nextLine();
    // if (name == null)
    // throw new IllegalArgumentException("isim null olmaz");

    // age = sc.nextInt();
    // if (age < 0)
    // throw new IllegalArgumentException("yas 0 dan kucuk olmaz");

    // maas = sc.nextDouble();
    // if (maas < 0)
    // throw new IllegalArgumentException("maas negatif olmaz.");

    // System.out.println(m1);
    // } catch (Exception e) {
    // System.out.println(e.getMessage());
    // }

    // System.out.println("program devam ediyor");
    // }
}

class BilgisayarMuhendisi extends Muhendis {

    String bilinenDil;

    public BilgisayarMuhendisi(String name, int age, double maas, String dil) {
        super(name, age, maas);
        this.bilinenDil = dil;
    }

    public void merhaba() {
        System.out.println("ben malim");
    }

    public void asd() {
        System.out.println("asd");
    }
}