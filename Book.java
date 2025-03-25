public class Book {
    private String title;
    private int pages;
    private boolean isBorrowed;

    // Constructor
    public Book(String title, int pages)
            throws InvalidBookException {
        if (title == null || title.isEmpty()) {
            throw new InvalidBookException("Invalid book title.");
        }
        if (pages <= 0) {
            throw new InvalidBookException("Invalid number of pages.");
        }
        this.title = title;
        this.pages = pages;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
        } else {
            System.out.println("Book already borrowed.");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
        } else {
            System.out.println("Book is not borrowed.");
        }
    }
}