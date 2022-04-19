import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * UC7_ValidatePasswordRule3
 * 
 * Rule3
– Should
have at least 1
numeric number in
the password - NOTE – All rules must be passed
 * 
 */

public class UC7_ValidatePasswordRule3 {
    //UC7-Rule3
    public static final String getPasswordRegexPatternRule3 = "^[A-Z]{1,}[0-9]{1,}[a-z]{6,}$";

    // UC7- Rule3-method to validate password of minimum 1 numeric character
    public static void validatePasswordRule3() {
        System.out.print("Enter Password :- ");
        Scanner input = new Scanner(System.in);
        String passWord = input.next();
        Pattern pattern = Pattern.compile(getPasswordRegexPatternRule3);
        Matcher matcher = pattern.matcher(passWord);
        boolean result = matcher.matches();
        if (result) {
            System.out.println("Password is Valid");
        } else {
            System.out.println("Password is Invalid");
        }
    }

    
}