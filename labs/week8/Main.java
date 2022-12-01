package labs.week8;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();

        b1.setTitle("erayin maceralari");
        String auth[] = { "eray", "asd" };
        b1.setAuthors(auth);

        for (String authors : b1.getAuthors())
            System.out.println(authors);

        System.out.println(b1.getTitle());

        System.out.println("\n");

        EMail e1 = new EMail();
        String[] to = { "asd", "sda", "dsa" };
        e1.setTo(to);
        e1.setSubject("hello world");

        e1.setAuthors(auth);

        System.out.println(e1.getSubject());

        for (String tos : e1.getTo())
            System.out.println(tos);

    }
}
