
 /**
  * Uc6
  * 
  * As a User need to follow pre-defined Password rules.
 * Rule1 –> minimum 8 Characters
 * Rule2 –> Should have at least 1 Upper Case Letter
 * NOTE – All rules must be passed
  */


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Uc6 {

    @Test
    void whenPasswordGiven_CheckUpperCase_whenProper_ShouldreturnTrue() {
        UserRegistration userRegistration= new UserRegistration();
        boolean output = userRegistration.UpperCaseValidator("Ajinkyakambe");
        Assertions.assertTrue(output);      // true
    }

    @Test
    void whenPasswordGiven_CheckUpperCase_whenNotProper_ShouldreturnFalse() {
        UserRegistration userRegistration= new UserRegistration();
        boolean output = userRegistration.UpperCaseValidator("ajinkya");
        Assertions.assertFalse(output);     // false
    }
}
