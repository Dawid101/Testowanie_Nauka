package pl.coderslab.week2.enums;

public class Movie {
    private String title;
    private Genre genre;
    private String director;

    public Movie(String title, Genre genre, String director) {
        this.title = title;
        this.genre = genre;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Director: " + director);
    }
}
