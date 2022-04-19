import java.util.Scanner;  // scanner class

/**
 * Class UserRegMain with calling all the UC from 1 to 10.
 */

public class UserRegMainUC9 {
    
    public static void main(String args[]) {

        System.out.println("Welcome to User Registration System Program");
        System.out.println("Please select your choices");
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1.To Validate First Name \n2.To Validate Last Name \n3.To Validate Mail \n4.To Validate Mobile Number \n5.To Validate Password Rule1 of Min 8 Characters \n6.To Validate Password Rule2 of Min One Upper case \n7.To Validate Password Rule3 of One Numeric Character \n8.To Validate Password Rule4 of One Special Character  ");
            choice = input.nextInt();
            switch (choice) {
                case 1:  // Uc1
                System.out.println("===============================");
                UC1_UserValidateFirstName.validateFirstName();
                System.out.println("===============================");
                    break;
                case 2:  // Uc2
                System.out.println("===============================");
                UC2_ValidateUserLastName.validateLastName();
                System.out.println("===============================");
                    break;
                case 3:  // Uc3
                System.out.println("===============================");
                UC3_ValidMail.validateMail();
                System.out.println("===============================");
                    break;
                case 4:  // Uc4
                System.out.println("===============================");
                UC4_ValidateMobileNumber.validateMobileNumber();
                System.out.println("===============================");
                    break;
                case 5:  // Uc5
                System.out.println("===============================");
                UC5_ValidatePasswordRule1.validatePasswordRule1();
                System.out.println("===============================");
                    break;
                case 6:  // Uc6
                System.out.println("===============================");
                UC6_ValidatePasswordRule2.validatePasswordRule2();
                System.out.println("===============================");
                    break;
                case 7:  // Uc7
                System.out.println("===============================");
                UC7_ValidatePasswordRule3.validatePasswordRule3();
                System.out.println("===============================");
                    break;
                case 8:  // Uc8
                System.out.println("===============================");
                UC8_ValidateUserPasswordRule4.validatePasswordRule4();
                System.out.println("===============================");
                    break;
                
                
            }
        }
        while (choice != 9);
    }
}




