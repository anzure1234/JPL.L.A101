package fa.training.services;

import fa.training.entities.Book;
import fa.training.entities.Publication;

import java.sql.SQLOutput;
import java.util.*;

public class BookServiceImpl implements BookService{
    public List<Book> books= new ArrayList<>();
    @Override
    public void addBook() {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        System.out.println("Enter isbn: ");
        book.setIsbn(sc.nextLine());
        System.out.println("Enter publication place: ");
        book.setPublicationPlace(sc.nextLine());
        System.out.println("Enter publication year: ");
        book.setPublicationYear(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter publisher: ");
        book.setPublisher(sc.nextLine());
        books.add(book);
        System.out.println("Add book successfully");
    }

    @Override
    public Set<Book> searchBookByIsbn(int a) {
        Set<Book> result = new HashSet<>();
        for (Book book:books) {
            if(book.getIsbn().contains(String.valueOf(a))){
                result.add(book);
            }
            else
                System.out.println("Not found");
        }
        return result;
    }

    @Override
    public Set<Book> searchBookByAuthor(String b) {
        Set<Book> result = new HashSet<>();
        for (Book book:books) {
            if(book.getIsbn().contains(b)){
                result.add(book);
            }
            else
                System.out.println("Not found");
        }

        return result;
    }

    @Override
    public Set<Book> searchBookByPublisher(String c) {
        Set<Book> result = new HashSet<>();
        for (Book book:books) {
            if(book.getIsbn().contains(c))
                result.add(book);
            else
                System.out.println("Not found");
        }

        return result;
    }

    @Override
    public void addAuthorToBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter isbn: ");
        String isbn = sc.nextLine();
        System.out.println("Enter author: ");
        String author = sc.nextLine();
        for (Book book:books) {
            if(book.getIsbn().equals(isbn)){
                book.getAuthor().add(author);
                System.out.println("Success");
            }else{
                System.out.println("Not success");
            }
        }
    }
}
