public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Alice");

        LibraryResource book = new Book("Introduction to Algorithms");
        LibraryResource journal = new Journal("Science Daily - AI Edition");

        student.borrowResource(book);
        student.borrowResource(journal);

        LibraryResource eBook = new EBook("Design Patterns in Java");
        student.borrowResource(eBook);
    }
}
