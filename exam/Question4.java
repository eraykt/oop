package exam;

public class Question4 {
    public static void main(String[] args) {
        A a1 = new E();
        ((E) a1).t();

        A a2 = new C();
        a2.y();

        A a3 = new D();
        if (a3 instanceof C)
            a3.x();

        a3 = a1;
        ((D) a3).q();

        B b = new C();
        b.z();
    }
}

abstract class C implements A {
    @Override
    public void x() {
        System.out.println(" c is doing x");
    }

    public abstract void y();
}

class D extends C {
    @Override
    public void x() {
        System.out.println("d is doing x");
    }

    @Override
    public void y() {
        System.out.println("d is doing y");
    }

    void q() {
        System.out.println("d is doing q");
    }
}

class E extends C {
    void t() {
        System.out.println("e doing t");
    }

    @Override
    public void y() {
        System.out.println(" e is doing y");
    }
}

class F extends C implements B {
    @Override
    public void y() {
        System.out.println(" c is doing y");
    }

    @Override
    public void z() {
        System.out.println(" c is doing z");
    }
}

interface A {

    void x();

    void y();
}

interface B {
    void z();
}