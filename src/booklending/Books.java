package booklending;

/**
 * Myclass
 * @author Jariyawadee
 */
public class Books {

    private int bookCategory;
    private int bookCode;
    private String name;

    /**
     * 
     * @param bookCategory
     * @param bookCode
     * @param name 
     */
    public Books(int bookCategory, int bookCode, String name) {
        this.bookCategory = bookCategory;
        this.bookCode = bookCode;
        this.name = name;
    }

    /**
     * 
     * @param bookCategory 
     */
    public void setBookCategory(int bookCategory) {
        this.bookCategory = bookCategory;
    }
    /**
     * 
     * @param bookCode 
     */

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }
    
    /**
     * 
     * @param name of book 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return bookCategory
     */
    public int getBookCategory() {
        return bookCategory;
    }

    /**
     * 
     * @return bookCode
     */
    public int getBookCode() {
        return bookCode;
    }

    /**
     * 
     * @return name of book 
     */
    public String getName() {
        return name;
    }
    
    /**
     * Print Book Category , Book Code and Book Name
     */
    public void displayBooks() {
        System.out.println("Book Category : " + this.getBookCategory());
        System.out.println("Book Code : " + this.getBookCode());
        System.out.println("Book Name : " + this.getName());
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "BOOK { " + "Category = " + this.getBookCategory() + ", Code = " + this.getBookCode() + ", Name = " + this.getName() + " }";
    }

}
