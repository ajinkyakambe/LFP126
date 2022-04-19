import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * UC 3
 * As a User need to enter a valid email
 * 
- E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl
& co) and 2 optional (xyz & in) with
precise @ and . positions
 */

public class UC3_ValidMail {

  
   static String emailRegexPattern = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";

    

    //  UC3- method to validate mail
    public static void validateMail() {
        System.out.print("Enter your Mail ID :- ");
        Scanner input = new Scanner(System.in);
        String eMail = input.nextLine();
        Pattern pattern = Pattern.compile(emailRegexPattern);
        Matcher matcher = pattern.matcher(eMail);
        boolean retrurn = matcher.matches();
        if (retrurn) {
            System.out.println("Mail ID is Valid");
        } else {
            System.out.println("Mail ID is Invalid");
        }
    }
 }