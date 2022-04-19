  /**
  * Uc8
  * 
   * As a User need to follow pre-defined Password rules.
    * Rule1 –> minimum 8 Characters
    * Rule2 –> Should have at least 1 Upper Case Letter
    * Rule3 –> Should have at least 1 numeric number in the password
    * Rule4 –> Has exactly 1 Special Character
    * NOTE – All rules must be passed
 *
  */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Uc8 {

    @Test
    void whenPasswordGiven_CheckSpecialChar_whenProper_ShouldreturnTrue() {
        UserRegistration userRegistration= new UserRegistration();
        boolean output = userRegistration.specialCharValidator("Ajinkya@008");
        Assertions.assertTrue(output);      // true
    }

    @Test
    void whenPasswordGiven_CheckSpecialChar_whenNotProper_ShouldreturnTrue() {
        UserRegistration userRegistration= new UserRegistration();
        boolean output = userRegistration.specialCharValidator("hgfrter");
        Assertions.assertFalse(output);     // false
    }
}
