package homeworks.second;

public class Student {
    private int midterm;
    private int finalExam;

    public Student(int midterm, int finalExam) {
        this.finalExam = SetFinalExam(finalExam);
        this.midterm = SetMidterm(midterm);
    }

    int SetMidterm(int midterm) {
        if (midterm < 0 || midterm >= 100)
            throw new IllegalArgumentException("zort");
        return midterm;
    }

    int SetFinalExam(int finalExam) {
        if (finalExam < 0 || finalExam >= 100)
            throw new IllegalArgumentException("zattiri zort");
        return finalExam;
    }

}

class MainC {
    public static void main(String[] args) {

        try {
            Student st = new Student(120, -10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // System.out.println(st);
    }
}
