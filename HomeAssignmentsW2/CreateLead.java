package week2.HomeAssignmentsW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");

		WebElement usernameFiled = driver.findElement(By.id("username"));
		usernameFiled.sendKeys("demosalesmanager");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");

		WebElement sbmtBtn = driver.findElement(By.className("decorativeSubmit"));
		sbmtBtn.click();

		WebElement enterCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		enterCRMSFA.click();

		WebElement lead = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		lead.click();

		WebElement createLead = driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]"));
		createLead.click();

		WebElement leadFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		leadFirstName.sendKeys("Pankaj");

		WebElement leadLastName = driver.findElement(By.id("createLeadForm_lastName"));
		leadLastName.sendKeys("L");

		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("P-Company");

		WebElement leadTitle = driver.findElement(By.id("createLeadForm_generalProfTitle"));
		leadTitle.sendKeys("Title of the Company");

		WebElement createLeadBtn = driver.findElement(By.xpath("//input[@type='submit' and @value='Create Lead']"));
		createLeadBtn.click();

		String expTitle = "View Lead | opentaps CRM";

		String actTitle = driver.getTitle();
//		System.out.println(actTitle);


		if (expTitle.equals(actTitle)){
			System.out.println(actTitle+ "  := Title is displayed correctly");
		}else {
			System.out.println("Title is not displayed correctly");
		}
	}

}