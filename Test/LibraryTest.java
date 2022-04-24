import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void findBook() {
        Library library = new Library();
        try {
            assertEquals(library.getBookName(),library.findBook(1234));
            assertEquals(library.getBookName(),library.findBook(4321));
        } catch (BookNotFoundException e) {
            System.out.println("Book Not Found Exception in LibraryTest: "+e.getMessage());
        }
    }
}