import java.util.Scanner;  // scanner class

/**
 * Class UserRegMain with calling all the UC from 1 to 10.
 */

public class UserRegMain {
    
    public static void main(String args[]) {

        System.out.println("Welcome to User Registration System Program");
        System.out.println("Please select your choices");
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1.To Validate First Name \n2.To Validate Last Name");
            choice = input.nextInt();
            switch (choice) {
                case 1:  // Uc1
                System.out.println("===============================");
                UC1_UserValidateFirstName.validateFirstName();
                System.out.println("===============================");
                    break;
                case 2:  // Uc1
                System.out.println("===============================");
                UC2_ValidateUserLastName.validateLastName();
                System.out.println("===============================");
                    break;
                
                
            }
        }
        while (choice != 3);
    }
}

