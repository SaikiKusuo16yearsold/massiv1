public class Book {
    private String title;
    private Author author;
    private int yearPublication;

    Book(String title, Author author, int yearPublication) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int year) {
        this.yearPublication = year;
    }

    public boolean equals(Book b) {
        return this.title.equals(b.getTitle()) && this.yearPublication == b.getYearPublication()
                && this.author.equals(b.getAuthor());
    }

    public String toString() {
        return "Название книги " + title + " ее автор " + author + " год выпска " + yearPublication;
    }

    public int hashCod() {
        return this.hashCode();
    }

}
