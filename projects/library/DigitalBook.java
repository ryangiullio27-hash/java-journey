public class DigitalBook extends Book implements Searchable {
    private float sizeMB;

    public DigitalBook(String title, String author, String publicationYear, float sizeMB, String summary) {
        super(title, author, publicationYear, summary);
        this.sizeMB = sizeMB;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Digital");
        System.out.println("Size: " + sizeMB + " MB");
    }

    public float getSizeMB() {
        return sizeMB;
    }
}
