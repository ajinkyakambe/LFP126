import java.util.Scanner;  // scanner class
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * UC 1
 * As a User need to enter a valid First Name

//- First name char starts with Cap and has
minimum 3 characters
 */

public class UC1_UserValidateFirstName {
	//Declaring patterns
    static String firstNamePatternRegex = "^[A-Z]{1}[a-z]{3,}$";
    //- regex First name char starts with Cap and has minimum 3 characters

    //  UC1- method to validate first name
    public static void validateFirstName() {
        System.out.print("\n Enter First Name :- ");
        Scanner input = new Scanner(System.in);
        String firstname = input.nextLine();
        
        Pattern pattern = Pattern.compile(firstNamePatternRegex);
        Matcher matcher = pattern.matcher(firstname);
        boolean result = matcher.matches();
        if (result) {
            System.out.println(" FirstName is Valid");
        } else {
            System.out.println(" FirstName is Invalid");
        }
    }
    
 }