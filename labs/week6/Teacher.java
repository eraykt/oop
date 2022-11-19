package labs.week6;

enum Branch {
    MATH("math info"),
    PHYSICS("physics info"),
    CS("cs info"),
    ENG("eng info");

    final String info;

    private Branch(String info) {
        this.info = info;
    }

    public String getInfo() {
        return this.info;
    }
}

public class Teacher {
    private int id;
    Branch branch;

    public Teacher(int id, Branch branch) {
        this.id = id;
        this.branch = branch;
    }
}
