public class Library {
    private final String BOOK_NAME= "book name";
    private final int BOOK_ID= 1234;

    public String findBook(int bookID) throws BookNotFoundException{
        if(bookID != BOOK_ID){
            throw new BookNotFoundException("Entered ID Not Found");
        }
        return BOOK_NAME;
    }

    public String getBookName() {
        return BOOK_NAME;
    }

}
