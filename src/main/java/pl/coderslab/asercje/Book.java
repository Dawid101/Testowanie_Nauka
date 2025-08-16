package pl.coderslab.asercje;

public class Book {
    private String title;
    private String author;
    private String yearOfPublication;
    private boolean isAvailable;

    public Book(String title, String author, String yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public Book(String title, String author, String yearOfPublication, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
