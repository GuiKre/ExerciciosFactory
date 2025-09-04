public class Book extends LibraryItem{
    private String genre;

    public Book(String title, String author, int publicationYear, String genre) {
        super(title, author, publicationYear);
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Gênero: " + this.genre);
    }
    
    public void readSample() {
        System.out.println("Lendo uma amostra do livro '" + getTitle() + "'...");
    }

    @Override
    public void borrow() {
        System.out.println("O livro '" + getTitle() + "' foi emprestado.");
    }
    
    @Override
    public void returnItem() {
        System.out.println("O livro '" + getTitle() + "' foi devolvido.");
    }
}
