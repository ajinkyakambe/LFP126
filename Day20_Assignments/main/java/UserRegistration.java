
public class UserRegistration {

    //Declaring Regex patterns

    //UC1
    private static final String FIRSTNAMEREGEXPATTERN = "^[A-Z]{1}[a-z]{3,}$";
    //UC2
    private static final String LASTNAMEREGEXPATTERN = "^[A-Z]{1}[a-z]{3,}$";
    //UC3
    private static final String EMAILREGEXPATTERN = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
    //UC4
    private static final String MOBILENOFORMATREGEXPATTERN = "^[9,1]{2}?[0-9]{10}$";
    //UC5Rule1
    private static final String PASSWORDREGEXPATTERNRULE1 = "^[a-zA-Z0-9]{8,}$";
    //UC6-Rule2
    private static final String PASSWORDREGEXPATTERNRULE2 = "^[A-Z]{1,}[a-z]{7,}$";
    //UC7-Rule3
    private static final String PASSWORDREGEXPATTERNRULE3 = "^[A-Z]{1,}[0-9]{1,}[a-z]{6,}$";
    //UC8-Rule4
    private static final String PASSWORDREGEXPATTERNRULE4 = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()<>]).{8,}$";
  


     public boolean FirstNameValidator(String fname){
         
          Pattern pattern = Pattern.compile(FIRSTNAMEREGEXPATTERN);
          return pattern.matcher(fname).matches();
     }

     public boolean LastNameValidator(String lname){
          
          Pattern pattern = Pattern.compile(LASTNAMEREGEXPATTERN);
          return pattern.matcher(lname).matches();
     }

     public boolean EmailValidator(String email){
         
          Pattern pattern = Pattern.compile(EMAILREGEXPATTERN);
          return pattern.matcher(email).matches();
     }

     public boolean PhoneNumberValidator(String phoneNumber) {
         
          Pattern pattern = Pattern.compile(MOBILENOFORMATREGEXPATTERN);
          return pattern.matcher(phoneNumber).matches();
     }

     public boolean CharacterValidator(String name) {
          
          Pattern pattern = Pattern.compile(PASSWORDREGEXPATTERNRULE1);
          return pattern.matcher(name).matches();
     }

     public boolean UpperCaseValidator(String name) {
         
          Pattern pattern = Pattern.compile(PASSWORDREGEXPATTERNRULE2);
          return pattern.matcher(name).matches();
     }

     public boolean NumberValidator(String number) {
         
          Pattern pattern = Pattern.compile(PASSWORDREGEXPATTERNRULE3);
          return pattern.matcher(number).matches();
     }

     public boolean SpecialCharValidator(String specialChar) {
         
          Pattern pattern = Pattern.compile(PASSWORDREGEXPATTERNRULE4);
          return pattern.matcher(specialChar).matches();
     }
}
