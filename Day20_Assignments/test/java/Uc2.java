
 /**
  * Uc2
  * 
  * As a User need to enter a valid Last Name
  * - Last name starts with Cap and has minimum 3 characters
  */


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Uc2 {

    @Test
    void whenLastNameGiven_whenProper_ShouldreturnTrue() {
        UserRegistration userRegistration= new UserRegistration();
        boolean output = userRegistration.LastNameValidator("Kambe");
        Assertions.assertTrue(output);      // true
    }

    @Test
    void whenLastNameGiven_whenNotProper_ShouldreturnFalse() {
        UserRegistration userRegistration= new UserRegistration();
        boolean output = userRegistration.LastNameValidator("kambe");
        Assertions.assertFalse(output);     // false
    }
}
