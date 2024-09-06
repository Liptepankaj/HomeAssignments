package week3.InherianceAssignmentsW3;

public class Elements extends Button {
	public static void main(String[] args) {
		
		//Current class object creation and method calling
		Elements el = new Elements();
		el.submit();
		el.click();
		el.settext("WebElement's Method is executed by Elements Class object");
		
		//1st Separate Subclass of WebElements Class
		TextField tf = new TextField();
		tf.getText();
		tf.click();
		tf.settext("WebElement's Method is executed by TextField Class object");
		
		//1st Child Class of Button
		CheckBoxButton chbx = new CheckBoxButton();
		//execution of CheckBoxButton class method
		chbx.clickCheckButton();
		chbx.submit();
		chbx.click();
		chbx.settext("WebElement's Method is executed by CheckBoxButton Class object");

		//2nd Child Class of Button
		RadioButton rdbtn = new RadioButton();
		rdbtn.selectRadioButton();
		rdbtn.submit();
		rdbtn.click();
		rdbtn.settext("WebElement's Menthod is executed by RadioButton Class object");
		
	}
}
