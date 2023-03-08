package fa.training.main;

import fa.training.entities.Book;
import fa.training.entities.Magazine;
import fa.training.services.BookServiceImpl;
import fa.training.services.MagazineServiceImpl;

import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        BookServiceImpl bookService = new BookServiceImpl();
        MagazineServiceImpl magazineService = new MagazineServiceImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("=============Library Management System=============");
        System.out.println("1. Add new book");
        System.out.println("2. Add new magazine");
        System.out.println("3. Display all books and magazine");
        System.out.println("4. Add author to book");
        System.out.println("5. Display top 10 of magazines by volume");
        System.out.println("6. Search book by(isbn, author, publisher)");
        System.out.println("Please choose function you'd like to do:");

        while(true){
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("========Add new book==========");
                    bookService.addBook();
                    break;
                case 2:
                    System.out.println("========Add new magazine==========");
                    magazineService.addMagazine();
                    break;
                case 3:
                    System.out.println("========Display all books and magazine==========");
                    for (Book book:bookService.books) {
                        System.out.println(book);
                    }
                    for (Magazine magazine:magazineService.magazines) {
                        System.out.println(magazine);
                    }
                    break;
                case 4:
                    System.out.println("========Add author to book==========");
                    bookService.addAuthorToBook();
                    break;
                case 5:
                    System.out.println("========Display top 10 of magazines by volume==========");
                    magazineService.displayTop10MagazineByVolume();
                    break;
                case 6:
                    System.out.println("========Search book by(isbn, author, publisher==========");
                    System.out.println("1. Search book by isbn");
                    System.out.println("2. Search book by author");
                    System.out.println("3. Search book by publisher");
                    System.out.println("Please choose function you'd like to do:");
                    int choice1 = sc.nextInt();
                    switch (choice1){
                        case 1:
                            System.out.println("========Search book by isbn==========");
                            System.out.println("Enter isbn:");
                            int a = sc.nextInt();
                            System.out.println(bookService.searchBookByIsbn(a));
                            break;
                        case 2:
                            System.out.println("========Search book by author==========");
                            System.out.println("Enter author:");
                            String b = sc.nextLine();
                            System.out.println(bookService.searchBookByAuthor(b));

                            break;
                        case 3:
                            System.out.println("========Search book by publisher==========");
                            System.out.println("Enter publisher:");
                            String c = sc.nextLine();
                            System.out.println(bookService.searchBookByPublisher(c));
                            break;
                        default:
                            System.out.println("Exit");
                            break;
                    }
                    break;
                default:
                    System.out.println("Exit");
                    break;
            }
        }
    }
}
