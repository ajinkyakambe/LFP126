 /**
  * Uc1
  * 
  *  As a User need to enter a valid First Name
  * - First name starts with Cap and has minimum 3 characters
  */


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Uc1 {

    @Test
    void whenFirstNameGiven_whenProper_ShouldreturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean output = userRegistration.FirstNameValidator("Ajinkya");
        Assertions.assertTrue(output);      // true
    }

    @Test
    void whenFirstNameGiven_whenNotProper_ShouldreturnFalse() {
        UserRegistration userRegistration1 = new UserRegistration();
        boolean output1 = userRegistration1.FirstNameValidator("kambe");
        Assertions.assertFalse(output1);    // flase
    }

}
