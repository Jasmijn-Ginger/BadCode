package auctionsite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AuctionSiteTest {

  /*
   painting was declared als AuctionItem, dan wil hij de getListing van de parent nemen, waar geen parameters in zaten.
   Twee opties:
   1. maak painting een Painting, ipv AuctionItem
   2. voeg parameter date toe aan AuctionItem.getListing
   Hangt er vanaf wat je er later mee wil doen, welke optie het slimst is.
   */

  @Test
  void testListing(){
    Painting painting = new Painting("De Nachtwacht", "Een schilderij van Rembrandt", 1000000, "Rembrandt", "Barok");
    assertEquals("De Nachtwacht - Een schilderij van Rembrandt - 1000000 - Rembrandt - Barok - 05-12-2023", painting.getListing("05-12-2023"));
  }

}
