package week2.day3;

public class LoginTestData extends TestData{
	
	public void enterUsername() {
		System.out.println("Enter the User Name");
	}
	
    public void enterPassword() {
		System.out.println("Enter the Password");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginTestData log = new LoginTestData();
		log.enterCredentials();
		log.navigateToHomePage();
		log.enterUsername();
		log.enterPassword();

	}

}
