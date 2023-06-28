public class BookstoreApplication {
    public static void main(String[] args) {

        Bookstore bookstore = new Bookstore();

        Book book1 = new Book("A GYŰRŰ SZÖVETSÉGE", "J.R.R. TOLKIEN", 4000);
        Book book2 = new Book("A KÉT TORONY", "J.R.R. TOLKIEN", 4000);
        Book book3 = new Book("A KIRÁLY VISSZATÉR", "J.R.R. TOLKIEN", 4000);

        bookstore.addBook(book1);
        bookstore.addBook(book2);
        bookstore.addBook(book3);

        try {
            String title = "alma";
            Book foundBook = bookstore.findBook(title);
            System.out.println(foundBook);
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }

        bookstore.displayBooks();
    }
}