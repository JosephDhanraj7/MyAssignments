package week2.day3;

public class Execution extends Button{
	public static void main(String[] args) {
		Execution exe = new Execution();
		exe.click();
		exe.setText("Inheritance");
		exe.submit();
		
		RadioButton radbutton = new RadioButton();
		radbutton.selectRadioButton();
		
		CheckBoxButton chkbxbutton = new CheckBoxButton();
		chkbxbutton.clickCheckButton();
	}

}
