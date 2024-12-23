package oopProjectResturant;

public class User {
	
	private String username = "admin";
	private String password = "password";

	public Login authenticate(String enteredUsername, String enteredPassword) {
        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            return Login.SUCCESS;
        } else if (!enteredUsername.equals(username)) {
            return Login.USERNAME_INCORRECT;
        } else {
            return Login.PASSWORD_INCORRECT;
        }
    }
}