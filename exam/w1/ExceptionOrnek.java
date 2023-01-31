package exam.w1;

public class ExceptionOrnek {
    String name;
    int age;

    public ExceptionOrnek(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        ExceptionOrnek w1;
        try {
            w1 = new ExceptionOrnek("eray", -5);

            if (w1.age < 0)
                throw new IllegalArgumentException("boyle yas olmaz");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

    }

}
