package labs.week4;

public class Worker {
    String name;
    double salary;
    static int counter;

    public Worker() {
        counter++;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public void SetSalary(double salary) {
        this.salary = salary;
    }

    public void ShowWorkerCount() {
        System.out.println(counter);
    }
}
