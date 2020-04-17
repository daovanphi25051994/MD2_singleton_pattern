public class Main {
    public static void main(String[] args) {
        BookBorrower bookBorrower1 = new BookBorrower();
        BookBorrower bookBorrower2 = new BookBorrower();

        bookBorrower1.borrowBook();
        System.out.println(bookBorrower1.getAuthorAndTitle());
        bookBorrower2.borrowBook();
        System.out.println(bookBorrower2.getAuthorAndTitle());
        System.out.println();
        bookBorrower1.returnBook();
        System.out.println("BookBorrower1 returned the book");
        bookBorrower2.borrowBook();
        System.out.println(bookBorrower2.getAuthorAndTitle());

    }
}
