public class BookFactory extends LibraryItemFactory {
    
    private String title;
    private String author;
    private int publicationYear;
    private String genre;

    public BookFactory(String title, String author, int publicationYear, String genre) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.genre = genre;
    }

    @Override
    public LibraryItem createItem() {
        return new Book(title, author, publicationYear, genre);
    }
}
