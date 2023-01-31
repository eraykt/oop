package exam.w1;

public abstract class ProtectedField {
    protected int a = 31;
}

class Class2 extends ProtectedField {
    void func() {
        a = 5;
    }
}

class Class3 {
    void func2() {
        // a -> hata
    }
}

class Burak {
    int age;
    int id;
    String flut;

    public Burak(int age, int id) {
        this.age = age;
        this.id = id;
    }

    public Burak(String hoca) {
        this(18, 1);
        flut = hoca;
    }

}