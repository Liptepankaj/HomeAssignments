package week3.InherianceAssignmentsW3;

public class LoginTestData extends TestData {

	public void enterUsername() {
		System.out.println("Username Entered");
	}

	public void enterPassword() {
		System.out.println("Password Entered");
	}

	public static void main(String[] args) {
		
		LoginTestData subclass = new LoginTestData();
		subclass.enterCredentials();
		subclass.navigateToHomePage();
		subclass.enterUsername();
		subclass.enterPassword();
	}
}
