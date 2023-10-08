public class Book {
    private String title;
    private String author;
    private String isbn;
    private String[] chapters;

    // Constructor
    public Book(String title, String author, String isbn, String[] chapters) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.chapters = chapters;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String[] getChapters() {
        return chapters;
    }

    public void setChapters(String[] chapters) {
        this.chapters = chapters;
    }

    // toString method to display book information
    @Override
    public String toString() {
        StringBuilder chapterList = new StringBuilder();
        for (String chapter : chapters) {
            chapterList.append(chapter).append(", ");
        }

        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", chapters=[" + chapterList.toString() +
                "]}";
    }

    public static void main(String[] args) {
        // Sample chapters for a book
        String[] chapters = {"Introduction", "Chapter 1", "Chapter 2", "Conclusion"};

        // Create a Book object
        Book book = new Book("Java Programming", "John Doe", "1234567890", chapters);

        // Display book information
        System.out.println(book.toString());

        // Modify and display updated book information
        book.setTitle("Java Programming 2.0");
        book.setChapters(new String[]{"Introduction", "Chapter 1", "Chapter 2", "Chapter 3", "Conclusion"});
        System.out.println(book.toString());
    }
}

