package fa.training.entities;

import java.util.Scanner;

public abstract class Publication {
    private  int publicationYear;
    private String publisher;


    public Publication(int publicationYear, String publisher) {
        this.publicationYear = publicationYear;
        this.publisher = publisher;
    }

    public Publication() {
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    abstract void display ();

    public void addPublication(){
        Scanner scanner = new Scanner(System.in);


    }

    @Override
    public String toString() {
        return " Publication{" +
                "publicationYear=" + publicationYear +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
