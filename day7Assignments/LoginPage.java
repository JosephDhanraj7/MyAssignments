package week2.day3;

public class LoginPage extends BasePage{
	
	//Method Overriding concept
	
	@Override
	public void findElement() {
		System.out.println("Calling findElement Method in login page");
	}
	
	@Override
	public void clickElement() {
		System.out.println("Calling clickElement Method in login page");
	}
	
	@Override
	public void enterText() {
		System.out.println("Calling enterText Method in login page");
	}
	
	@Override
	public void performCommonTasks() {
		System.out.println("Calling performCommonTasks Method in login page");
	}
	
	public static void main(String[] args) {
		
		LoginPage login = new LoginPage();
		
		login.findElement();
		login.clickElement();
		login.enterText();
		login.performCommonTasks();
		
		BasePage Base = new BasePage();
		
		Base.findElement();
		Base.clickElement();
		Base.enterText();
		Base.performCommonTasks();
	}

}
