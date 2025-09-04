public class DigitalMedia extends LibraryItem {
    private String fileFormat;

    public DigitalMedia(String title, String author, int publicationYear, String fileFormat) {
        super(title, author, publicationYear);
        this.fileFormat = fileFormat;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Formato de Arquivo: " + this.fileFormat);
    }

    public void play() {
        System.out.println("Reproduzindo a mídia digital '" + getTitle() + "' no formato " + this.fileFormat + "...");
    }

    @Override
    public void borrow() {
        System.out.println("A mídia digital '" + getTitle() + "' foi baixada (emprestada).");
    }
    
    @Override
    public void returnItem() {
        System.out.println("A licença da mídia digital '" + getTitle() + "' foi revogada (devolvida).");
    }
}