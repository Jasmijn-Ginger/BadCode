package librarysystem;

import java.time.LocalDate;

public class Book extends LibraryItem {

  private static String author;

  protected Book(String newTitle, String newAuthor, LocalDate newPublicationDate) {
    super(newTitle, newPublicationDate);
    author = newAuthor;
  }

  /**
   * @return overview item text for book
   */
  public static String getOverviewItemText(){
    return LibraryItem.getOverviewItemText() + " by " + author;
  }

}
