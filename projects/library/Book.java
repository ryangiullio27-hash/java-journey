public class Book implements Searchable {
    private String title;
    private String author;
    private String publicationYear;
    private boolean borrowed;
    private String summary;

    public Book(String title, String author, String publicationYear, String summary) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.borrowed = false;
        this.summary = summary;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Summary: " + summary);
        System.out.println("Publication year: " + publicationYear);
        System.out.println("Status: " + (borrowed ? "Borrowed" : "Available"));
    }

    @Override
    public String getSummary() {
        return title + " by " + author + " (" + publicationYear + ")";
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return (this instanceof PhysicalBook ? "Physical" : this instanceof DigitalBook ? "Digital" : "Generic");
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void borrow() {
        if (!borrowed) {
            borrowed = true;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Book is already borrowed: " + title);
        }
    }

    public void returnBook() {
        if (borrowed) {
            borrowed = false;
            System.out.println("Book returned: " + title);
        } else {
            System.out.println("Book was not borrowed: " + title);
        }
    }

    public void status() {
        if (borrowed) {
            System.out.println("Book '" + title + "' is borrowed.");
        } else {
            System.out.println("Book '" + title + "' is available.");
        }
    }
}
