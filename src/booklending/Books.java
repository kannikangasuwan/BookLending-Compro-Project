package booklending;

public class Books {

    private int bookCategory;
    private int bookCode;
    private String name;

    public Books(int bookCategory, int bookCode, String name) {
        this.bookCategory = bookCategory;
        this.bookCode = bookCode;
        this.name = name;
    }

    public void setBookCategory(int bookCategory) {
        this.bookCategory = bookCategory;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBookCategory() {
        return bookCategory;
    }

    public int getBookCode() {
        return bookCode;
    }

    public String getName() {
        return name;
    }

    public void displayBooks() {
        System.out.println("Book Category : " + this.getBookCategory());
        System.out.println("Book Code : " + this.getBookCode());
        System.out.println("Book Name : " + this.getName());
    }

    @Override
    public String toString() {
        return "BOOK { " + "Category = " + this.getBookCategory() + ", Code = " + this.getBookCode() + ", Name = " + this.getName() + " }";
    }

}
