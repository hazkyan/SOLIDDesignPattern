public class EBook implements LibraryResource {
    private String title;

    public EBook(String title) {
        this.title = title;
    }

    @Override
    public void borrow() {
        System.out.println("Accessing e-Book: " + title);
    }

    @Override
    public String getTitle() {
        return title;
    }
}
