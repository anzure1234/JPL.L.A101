package fa.training.entities;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Book extends Publication{
        private String isbn;
        private Set<String> author = new HashSet<>();
        private String publicationPlace;

    public Book(int publicationYear, String publisher, String isbn, Set<String> author, String publicationPlace) {
        super(publicationYear, publisher);
        this.isbn = isbn;
        this.author = author;
        this.publicationPlace = publicationPlace;
    }

    public Book(String isbn, Set<String> author, String publicationPlace) {
        this.isbn = isbn;
        this.author = author;
        this.publicationPlace = publicationPlace;
    }

    public Book(){

    }

    public String getIsbn() {
        return isbn;
    }

    public  void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Set<String> getAuthor() {
        return author;
    }

    public void setAuthor(Set<String> author) {
        this.author = author;
    }

    public String getPublicationPlace() {
        return publicationPlace;
    }

    public void setPublicationPlace(String publicationPlace) {
        this.publicationPlace = publicationPlace;
    }
    public void display(){

    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", author=" + author +
                ", publicationPlace='" + publicationPlace + '\'' +
                '}'+super.toString();
    }
}
