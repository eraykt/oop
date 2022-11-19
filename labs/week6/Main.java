package labs.week6;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(1, Branch.CS);
        Teacher t2 = new Teacher(2, Branch.ENG);
        Teacher t3 = new Teacher(3, Branch.MATH);
        Teacher t4 = new Teacher(4, Branch.PHYSICS);

        Teacher[] teachers = { t1, t2, t3, t4 };

        for (Teacher teacher : teachers) {
            System.out.println(teacher.branch.getInfo());
        }
    }
}
