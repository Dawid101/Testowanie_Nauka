package pl.coderslab.week3.mockito;

public interface BookRepository {
    Book findByTitle(String title);
}
