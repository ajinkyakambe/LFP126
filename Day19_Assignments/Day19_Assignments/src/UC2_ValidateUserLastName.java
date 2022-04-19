import java.util.Scanner;  // scanner class
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * UC 2
 * As a User need to enter a valid Last Name

//- Last name char starts with Cap and has
minimum 3 characters
 */

public class UC2_ValidateUserLastName {

    //Declaring patterns
    static String lastNameRegexPattern= "^[A-Z]{1}[a-z]{3,}$";
    //- regex : Last name char starts with Cap and has minimum 3 characters

    //  UC2- method to validate last name
    public static void validateLastName() {
        System.out.print("\n Enter Last Name :- ");
        Scanner input = new Scanner(System.in);
        String lastName = input.nextLine();
        Pattern pattern = Pattern.compile(lastNameRegexPattern);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();
        if (result) {
            System.out.println(" LastName is Valid");
        } else {
            System.out.println(" LastName is Invalid");
        }
    }   
}


