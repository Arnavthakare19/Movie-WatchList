
public class Movie {
    private String name;
    private int year;
    private String genre;

    public Movie(String name, int year, String genre) {
        this.name = name;
        this.year = year;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return name + " (" + year + ") - " + genre;
    }
}
