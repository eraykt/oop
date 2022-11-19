package homeworks.third;

public class Odev {
    public static void main(String[] args) {
        Worker w1 = new Worker("ahmet");
        System.out.println(Worker.compName);

        Worker w2 = new Worker("Mert");
        Worker w3 = new Worker("Cenk");
        System.out.println(Worker.number);

        Worker w4 = new Worker("okan");
        System.out.println(w2.id);

        Company comp = new Company(4);
        comp.addWorker(w1);
        comp.addWorker(w2);
        comp.addWorker(w3);
        comp.addWorker(w4);

        System.out.println(Company.index);
        Worker.compName = "zort";
        comp.showData(w3);
    }
}

class Worker {
    String name;
    public static String compName;
    public static int number;
    public int id;

    public Worker(String n) {
        this(n, number);
        compName = "Iron and Steel";
    }

    public Worker(String n, int num) {
        number = num;
        number++;
        this.name = n;
        this.id = number;
    }
}

class Company {
    static int index;
    Worker[] workers;

    public Company(int num) {
        workers = new Worker[num];
    }

    void addWorker(Worker w) {
        workers[index] = w;
        index++;
    }

    public void showData(Worker w) {
        System.out.println(w.id + ":" + w.compName);
    }
}
