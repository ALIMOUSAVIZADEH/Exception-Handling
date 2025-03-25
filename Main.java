public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        try {
            Book book1 = new Book("Java Programming", 300);
            Book book2 = new Book("Design Patterns", -3); // Invalid
            Book book3 = new Book(null, 100); // Invalid
            Book book4 = new Book("", 400); // Invalid

            library.addBook(book1);
            library.addBook(book2);
            library.addBook(book3);
            library.addBook(book4);

            library.listBooks();
            library.borrowBook("Java Programming");
            library.returnBook("Clean Code");
            library.returnBook("Java Programming");

        } catch (InvalidBookException e) {
            System.out.println(e.getMessage());
        }

        library.listBooks();
    }
}