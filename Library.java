import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() +
                    ", Pages: " + book.getPages() +
                    ", Borrowed: " + book.isBorrowed());
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.borrow();
                System.out.println("Borrowed: " + title);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.returnBook();
                System.out.println("Returned: " + title);
                return;
            }
        }
        System.out.println("Book not found.");
    }
}