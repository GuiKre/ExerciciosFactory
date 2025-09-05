public class LibraryManagementSystem {
    public static void main(String[] args) {

        LibraryItemFactory bookFactory = new BookFactory("Duna", "Frank Herbert", 1965, "Ficção científica");
        LibraryItemFactory magazineFactory = new MagazineFactory("Veja", "Grupo Abril", 2025, 255);
        LibraryItemFactory digitalMediaFactory = new DigitalMediaFactory("Curso de Factory", "Professor de Factory", 2025, "MP4");

        LibraryItem book = bookFactory.createItem();
        LibraryItem magazine = magazineFactory.createItem();
        LibraryItem digitalMedia = digitalMediaFactory.createItem();


        LibraryItem[] items = {book, magazine, digitalMedia};

        for (LibraryItem item : items) {
            System.out.println("\n--- " + item.getTitle() + " ---");
            item.displayInfo();
            item.borrow();

            if (item instanceof Book) {
                ((Book) item).readSample();
            } else if (item instanceof Magazine) {
                ((Magazine) item).flipPages();
            } else if (item instanceof DigitalMedia) {
                ((DigitalMedia) item).play();
            }

            item.returnItem();
        }
    }
}
