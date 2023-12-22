package librarysystem;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

public class LibrarySystemTest {
  @Test
  void testCreateBooks(){
    Book book1 = new Book("The Lord of the Rings", "J. R. R. Tolkien", LocalDate.of(1954, 7, 29));
    Book book2 = new Book("1984", "George Orwell", LocalDate.of(1949, 6, 8));
    Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", LocalDate.of(1960, 7, 11));
    assertEquals("The Lord of the Rings (1954-07-29) by J. R. R. Tolkien", book1.getOverviewItemText());
  }

  @Test
  void testBookGetOverviewItemText() {
    LibraryItem book = new Book("The Lord of the Rings", "J. R. R. Tolkien", LocalDate.of(1954, 7, 29));
    assertEquals("The Lord of the Rings (1954-07-29) by J. R. R. Tolkien", book.getOverviewItemText());
  }

}
