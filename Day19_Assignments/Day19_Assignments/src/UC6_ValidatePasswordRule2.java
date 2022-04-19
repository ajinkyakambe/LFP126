import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * UC6_ValidatePasswordRule2
 * 
 */
public class UC6_ValidatePasswordRule2 {

     //UC6-Rule2
     public static final String passwordRegexPatternRule2 = "^[A-Z]{1,}[a-z]{7,}$";
    
     // UC6- Rule2-method to validate password of minimum 1 UpperCase
    public static void validatePasswordRule2() {
        System.out.print("Enter Password :- ");
        Scanner input = new Scanner(System.in);
        String passWord = input.next();
        Pattern pattern = Pattern.compile(passwordRegexPatternRule2);
        Matcher matcher = pattern.matcher(passWord);
        boolean result = matcher.matches();
        if (result) {
            System.out.println("Password is Valid");
        } else {
            System.out.println("Password is Invalid");
        }
    }

    
}