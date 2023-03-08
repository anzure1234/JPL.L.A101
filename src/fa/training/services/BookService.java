package fa.training.services;

import fa.training.entities.Book;

import java.util.Set;

public interface BookService {
    public void addBook();
    public Set<Book> searchBookByIsbn(int a);
    public Set<Book> searchBookByAuthor(String b);
    public Set<Book> searchBookByPublisher(String c);
    public void addAuthorToBook();

}
