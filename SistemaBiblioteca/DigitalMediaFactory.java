public class DigitalMediaFactory extends LibraryItemFactory {

    private String title;
    private String author;
    private int publicationYear;
    private String fileFormat;

    public DigitalMediaFactory(String title, String author, int publicationYear, String fileFormat) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.fileFormat = fileFormat;
    }

    @Override
    public LibraryItem createItem() {
        return new DigitalMedia(title, author, publicationYear, fileFormat);
    }
}
