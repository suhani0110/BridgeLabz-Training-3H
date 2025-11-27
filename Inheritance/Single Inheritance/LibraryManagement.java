public class LibraryManagement {
    public static void main(String[] args) {
        // Create an Author object
        Author authorBook = new Author(
            "The Java Journey",
            2021,
            "Jane Doe",
            "Jane Doe is a software engineer and author specializing in Java development."
        );

        // Display book and author info
        authorBook.displayInfo();
    }
}
