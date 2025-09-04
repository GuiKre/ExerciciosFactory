public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, String author, int publicationYear, int issueNumber) {
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Número da Edição: " + this.issueNumber);
    }

    public void flipPages() {
        System.out.println("Folheando as páginas da revista '" + getTitle() + "'...");
    }

    @Override
    public void borrow() {
        System.out.println("A revista '" + getTitle() + "' foi emprestada.");
    }
    
    @Override
    public void returnItem() {
        System.out.println("A revista '" + getTitle() + "' foi devolvida.");
    }
}
