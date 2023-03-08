package fa.training.entities;

public class Magazine extends Publication{
        private String author;
        private int volumn;
        private int edition;

    public Magazine(int publicationYear, String publisher, String author, int volumn, int edition) {
        super(publicationYear, publisher);
        this.author = author;
        this.volumn = volumn;
        this.edition = edition;
    }

    public Magazine(String author, int volumn, int edition) {
        this.author = author;
        this.volumn = volumn;
        this.edition = edition;
    }
    public Magazine(){

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getVolumn() {
        return volumn;
    }

    public void setVolumn(int volumn) {
        this.volumn = volumn;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
    public void display(){

    }

    @Override
    public String toString() {
        return "Magazine{" +
                "author='" + author + '\'' +
                ", volumn=" + volumn +
                ", edition=" + edition +
                '}'+super.toString();
    }
}
