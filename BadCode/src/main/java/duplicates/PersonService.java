package duplicates;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
  private final List<Person> persons = new ArrayList<>();


  public void addPerson(Person x) {
    boolean exists = false;
  //for a person on the list of persons
    for (Person p : persons) {
      //if a person on the list matches the one i'm trying to add
      if (p.toString().equals(x.toString())) {
        //it exists already so do nothing
        exists = true;
        break;
      }
    }
      //the person is not on the list, so add it
      if (!exists) {
        persons.add(x);
      }
    }


  /**
   * Returns the number of unique persons.
   * @return the number of unique persons
   */
  public int size(){
    return persons.size();
  }

}