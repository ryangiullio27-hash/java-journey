import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void printSummaries() {
        for (Book book : books) {
            System.out.println(book.getSummary());
        }
    }

    public void listBooks() {
        for (Book book : books) {
            book.displayInfo();
            System.out.println("-----------------------");
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found: " + book.getTitle() + " by " + book.getAuthor()
                        + " (" + book.getPublicationYear() + ")");
                return book;
            }
        }
        System.out.println("Book not found: " + title);
        return null;
    }
}
