***************************************************************************************************************************************************************/

  /**
  * Uc3
  * 
  * As a User need to enter a valid email
 * - E.g. abc.xyz@bl.co.in
 * - Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
 *
  */


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Uc3 {

    @Test
    void whenEmailGiven_whenProper_ShouldreturnTrue() {
        UserRegistration userRegistration= new UserRegistration();
        boolean output = userRegistration.EmailValidator("abc.xyz@bl.co.in");
        Assertions.assertTrue(output);      // true
    }

    @Test
    void whenEmailGiven_whenNotProper_ShouldreturnFalse() {
        UserRegistration userRegistration= new UserRegistration();
        boolean output = userRegistration.EmailValidator("abc.co.in");
        Assertions.assertFalse(output);     // false
    }
}
