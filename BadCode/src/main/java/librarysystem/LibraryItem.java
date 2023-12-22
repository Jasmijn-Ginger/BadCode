package librarysystem;

import java.time.LocalDate;

public abstract class LibraryItem {

  private static String title;
  private static LocalDate publicationDate;

  protected LibraryItem(String newTitle, LocalDate newPublicationDate) {
    title = newTitle;
    publicationDate = newPublicationDate;
  }

  /**
   * @return overview item text for library item
   */
  public static String getOverviewItemText(){
    return title + " (" + publicationDate + ")";
  }

}
