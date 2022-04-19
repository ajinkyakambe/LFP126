import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * UC5_ValidatePasswordRule1
 * As a User need to follow pre-defined
 //Password rules. 

Rule1– minimum 8 Characters - 
NOTE – All rules must be passed
 */
public class UC5_ValidatePasswordRule1 {

    public static final String passwordRegexPatternRule1= "^[a-zA-Z0-9]{8,}$";

    // UC5- Rule1-method to validate password of minimum 8 characters
    public static void validatePasswordRule1() {
        System.out.print("Enter Password :- ");
        Scanner input = new Scanner(System.in);
        String passWord = input.next();
        Pattern pattern = Pattern.compile(passwordRegexPatternRule1);
        Matcher matcher = pattern.matcher(passWord);
        boolean result = matcher.matches();
        if (result) {
            System.out.println("Password is Valid");
        } else {
            System.out.println("Password is Invalid");
        }
    }
}