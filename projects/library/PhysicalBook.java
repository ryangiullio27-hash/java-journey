public class PhysicalBook extends Book implements Searchable {
    private int pageCount;

    public PhysicalBook(String title, String author, String publicationYear, int pageCount, String summary) {
        super(title, author, publicationYear, summary);
        this.pageCount = pageCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Physical");
        System.out.println("Pages: " + pageCount);
    }

    public int getPageCount() {
        return pageCount;
    }
}
