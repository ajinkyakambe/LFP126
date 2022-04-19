import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * UC4_ValidateMobileNumber
 * As a User need to follow pre -defined Mobile Format 
 * 
 * - E.g. 91 9919819801 - Country code follow by space and 10
digit number
 */


public class UC4_ValidateMobileNumber {
    static String mobileNoFormatRegexPattern = "^[9,1]{2}?[0-9]{10}$";

    //  UC4- method to validate mobile number
    public static void validateMobileNumber() {
        System.out.print("Enter Mobile Number :- ");
        Scanner input = new Scanner(System.in);
        String mobNum = input.next();
        Pattern pattern = Pattern.compile(mobileNoFormatRegexPattern);
        Matcher matcher = pattern.matcher(mobNum);
        boolean result = matcher.matches();
        if (result) {
            System.out.println("Mobile Number is Valid");
        } else {
            System.out.println("Mobile Number is Invalid");
        }
    }
    
}







