package pl.coderslab.week3.mockito;

public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book findBookByTitle(String title){
        return bookRepository.findByTitle(title);
    }
}
