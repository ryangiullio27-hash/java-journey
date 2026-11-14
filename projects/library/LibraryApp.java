import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Library!");
            System.out.println("1. Add book");
            System.out.println("2. List books");
            System.out.println("3. Search book by title");
            System.out.println("4. Borrow book");
            System.out.println("5. Return book");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (option) {
                case 1:
                    System.out.println("Enter the book title:");
                    String title = scanner.nextLine();
                    System.out.println("Enter the book author:");
                    String author = scanner.nextLine();
                    System.out.println("Enter the publication year:");
                    String publicationYear = scanner.nextLine();
                    System.out.println("Enter the book summary:");
                    String summary = scanner.nextLine();
                    System.out.println("Enter the book type (1 for Physical, 2 for Digital):");
                    int bookType = scanner.nextInt();
                    scanner.nextLine(); // consume the newline
                    if (bookType == 1) {
                        System.out.println("Enter the number of pages:");
                        int pageCount = scanner.nextInt();
                        scanner.nextLine(); // consume the newline
                        PhysicalBook physicalBook = new PhysicalBook(title, author, publicationYear, pageCount, summary);
                        library.addBook(physicalBook);
                    } else if (bookType == 2) {
                        System.out.println("Enter the file size in MB:");
                        float sizeMB = scanner.nextFloat();
                        scanner.nextLine(); // consume the newline
                        DigitalBook digitalBook = new DigitalBook(title, author, publicationYear, sizeMB, summary);
                        library.addBook(digitalBook);
                    } else {
                        System.out.println("Invalid book type. Adding as a generic book.");
                        Book newBook = new Book(title, author, publicationYear, summary);
                        library.addBook(newBook);
                    }
                    break;
                case 2:
                    library.listBooks();
                    break;
                case 3:
                    System.out.println("Enter the title to search for:");
                    String searchTitle = scanner.nextLine();
                    library.findBookByTitle(searchTitle);
                    break;
                case 4:
                    System.out.println("Enter the title of the book to borrow:");
                    String titleToBorrow = scanner.nextLine();
                    Book bookToBorrow = library.findBookByTitle(titleToBorrow);
                    if (bookToBorrow == null) {
                        System.out.println("Book not found for borrowing: " + titleToBorrow);
                    } else {
                        bookToBorrow.borrow();
                    }
                    break;
                case 5:
                    System.out.println("Enter the title of the book to return:");
                    String titleToReturn = scanner.nextLine();
                    Book bookToReturn = library.findBookByTitle(titleToReturn);
                    if (bookToReturn == null) {
                        System.out.println("Book not found for returning: " + titleToReturn);
                    } else {
                        bookToReturn.returnBook();
                    }
                    break;
                case 6:
                    System.out.println("Leaving the Library...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
