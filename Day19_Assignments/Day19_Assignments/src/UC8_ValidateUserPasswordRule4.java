import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * UC8_ValidateUserPasswordRule4
 * 
 * Rule4 – Has exactly
1 Special Character
- NOTE – All rules must be passed
 */
public class UC8_ValidateUserPasswordRule4 {
    //UC8-Rule4
   public static final String passwordRegexPatternRule4 = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()<>]).{8,}$";

   // UC8- Rule4-method to validate password must contain 1 special character
   public static void validatePasswordRule4() {
        System.out.print("Enter Password :- ");
        Scanner input = new Scanner(System.in);
        String passWord = input.next();
        Pattern pattern = Pattern.compile(passwordRegexPatternRule4);
        Matcher matcher = pattern.matcher(passWord);
        boolean result = matcher.matches();
        if (result) {
            System.out.println("Password is Valid");
        } else {
            System.out.println("Password is Invalid");
        }
    }
    
}