public class MagazineFactory extends LibraryItemFactory {
    
    private String title;
    private String author;
    private int publicationYear;
    private int issueNumber;

    public MagazineFactory(String title, String author, int publicationYear, int issueNumber) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.issueNumber = issueNumber;
    }

    @Override
    public LibraryItem createItem() {
        return new Magazine(title, author, publicationYear, issueNumber);
    }
}
