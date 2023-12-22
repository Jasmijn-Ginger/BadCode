package duplicates;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
  private final List<Person> persons = new ArrayList<>();

  public void addPerson(Person person){
    boolean exists = false;
    for (Person p : persons) {
      if (p == person) {
        exists = true;
        break;
      }
    }
    if (!exists) {
      persons.add(person);
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