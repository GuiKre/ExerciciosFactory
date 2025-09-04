public abstract  class LibraryItem implements Borrowble{
    protected String title;
    protected String author;
    protected int publicationYear;
    
    public LibraryItem(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Título: " + title);
        System.out.println("Autor/Editora: " + author);
        System.out.println("Ano de Publicação: " + publicationYear);
    }
    
    public String getTitle() {
        return title;
    }
}
