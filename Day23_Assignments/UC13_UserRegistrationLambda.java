import java.util.regex.*;
public class UserRegistrationLambda<UserValidationLamda> {

	final String nameValidate = "^[A-Z][a-z]{2,}$";
	final String mobileValidate = "^[9][1]{0,1}\\s[1-9]{1}[0-9]{9}";
	final String emailValidate = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9A-Za-z]+.[a-zA-Z]{2,4}([.][A-Za-z]{2,3})*$";
	final String passwordValidate = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[a-zA-Z0-9@$!%*#?&]{8,}$";
	
	private UserValidationLamda firstName = (regex) -> (regex.matches(nameValidate));
	private UserValidationLamda lastName = (regex) -> (regex.matches(nameValidate));
	private UserValidationLamda phoneNomber=(regex) -> (regex.matches(mobileValidate));
	private UserValidationLamda eMail=(regex) -> (regex.matches(emailValidate));
	private UserValidationLamda password=(regex) -> (regex.matches(passwordValidate));
	
	public UserValidationLamda getFirstName() {
		return firstName;
	}
	public void setFirstName(UserValidationLamda firstName) {
		this.firstName = firstName;
	}
	public UserValidationLamda getLastName() {
		return lastName;
	}
	public void setLastName(UserValidationLamda lastName) {
		this.lastName = lastName;
	}
	public UserValidationLamda getPhoneNomber() {
		return phoneNomber;
	}
	public void setPhoneNomber(UserValidationLamda phoneNomber) {
		this.phoneNomber = phoneNomber;
	}
	public UserValidationLamda geteMail() {
		return eMail;
	}
	public void seteMail(UserValidationLamda eMail) {
		this.eMail = eMail;
	}
	public UserValidationLamda getPassword() {
		return password;
	}
	public void setPassword(UserValidationLamda password) {
		this.password = password;
	}

}