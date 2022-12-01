package labs.week8;

import java.util.Date;

public class Document {
    private String[] authors;
    private Date date;

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] name) {
        authors = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
