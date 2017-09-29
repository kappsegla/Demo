package se.newton.martin.testning;

public class Movie {
    private String title;

    public Movie(){}

    public Movie(String batman) {
        setTitle(batman);
    }

    public void setTitle(String title) {
        if(  title == null || title.isEmpty())
            throw new IllegalArgumentException("Not a valid title");
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
