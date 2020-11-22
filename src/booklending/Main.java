package booklending;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        testPerson();
        // testBooksData();//ไว้เช็คว่ามีหนังสือใดที่สามารถยืมได้
        testLendingBook();

    }

    private static void testPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you First name : ");
        String firstName = sc.next();
        System.out.print("Enter you Last name : ");
        String lastName = sc.next();
        System.out.print("Enter you Id member : ");
        String Idmember = sc.next();
        Person p1 = new Person(firstName, lastName, Idmember);
        p1.displayPerson();
        System.out.println("---------------------------------------------------");
    }

    public static void testBooksData() {
        System.out.println("\tBooks that you can lend");
        BooksData.BookLists();
        System.out.println("---------------------------------------------------");
    }

    private static void testLendingBook() {
        Scanner sn = new Scanner(System.in);

        System.out.println("What service do you want to use?\n"
                + "If you want to lending books, Enter the number 11\n"
                + "If you want to return books, Enter the number 22");

        System.out.print("Enter number 11 or 22 : ");
        int number = sn.nextInt();
        System.out.println("---------------------------------------------------");
        switch (number) {
            case 11: {
                System.out.println("What books would you like to lend?");
                System.out.print("Enter bookcategory : ");
                int Bookcat = sn.nextInt();
                System.out.print("Enter bookcode : ");
                int Bookcode = sn.nextInt();
                System.out.print("Enter Book name : ");
                String Bookname = sn.next();
                Books b1 = new Books(Bookcat, Bookcode, Bookname);
                b1.displayBooks();
                System.out.println("number of the today");
                System.out.println("1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday, 7  = Sunday");
                System.out.print("Please enter the number of the Lending date : ");
                int input = sn.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("Return the book on Thursday");
                        break;
                    case 2:
                        System.out.println("Return the book on Friday");
                        break;
                    case 3:
                        System.out.println("Return the book on Saturday");
                        break;
                    case 4:
                        System.out.println("Return the book on Sunday");
                        break;
                    case 5:
                        System.out.println("Return the book on Monday");
                        break;
                    case 6:
                        System.out.println("Return the book on Tuesday");
                        break;
                    case 7:
                        System.out.println("Return the book on Wednesday");
                        break;
                    default:
                        System.out.println("Sorry, Don't have the day that you want");
                }
                break;
            }
            case 22: {
                System.out.println("What books would you like to return?");
                System.out.print("Enter bookcategory : ");
                int Bookcat = sn.nextInt();
                System.out.print("Enter bookcode : ");
                int Bookcode = sn.nextInt();
                System.out.print("Enter Book name : ");
                String Bookname = sn.next();
                Books b1 = new Books(Bookcat, Bookcode, Bookname);
                b1.displayBooks();
                System.out.println("Your book has been received.");
                System.out.println("---------------------------------------------------");

                System.out.println("Thank you for using the service");
                break;
            }
            default:
                System.out.println("You must enter number 11 or 22");
                break;
        }
    }
}
