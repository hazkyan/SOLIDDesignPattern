public class Journal implements LibraryResource {
    private String title;

    public Journal(String title) {
        this.title = title;
    }

    @Override
    public void borrow() {
        System.out.println("Borrowing Journal: " + title);
    }

    @Override
    public String getTitle() {
        return title;
    }
}
