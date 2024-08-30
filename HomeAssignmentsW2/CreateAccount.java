package week2.HomeAssignmentsW2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		
		WebElement sbmtBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		sbmtBtn.click();
		
		WebElement enterCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		enterCRMSFA.click();
		
		WebElement account = driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));
		account.click();
		
		WebElement createAccBtn = driver.findElement(By.xpath("//a[contains(text(),'Create Account')]"));
		createAccBtn.click();
		
		WebElement accName = driver.findElement(By.id("accountName"));
		accName.sendKeys("Pankaj L.");
		
		WebElement accDescription = driver.findElement(By.name("description"));
		accDescription.sendKeys("Selenium Automation Tester.");
		
		WebElement employeeNum = driver.findElement(By.id("numberEmployees"));
		employeeNum.sendKeys("10");
		
		WebElement siteName = driver.findElement(By.id("officeSiteName"));
		siteName.sendKeys("LeafTaps");
		
		WebElement creatbtn = driver.findElement(By.xpath("//input[@type='submit' and @value='Create Account']"));
		creatbtn.click();
		
		String expTitle = "Account Details | opentaps CRM";
		
		String actTitle = driver.getTitle();
//		System.out.println(actTitle);
		
		
		if (expTitle.equals(actTitle)){
			System.out.println(actTitle+ "  := Title is displayed correctly");
		}else {
			System.out.println("Title is not displayed correctly");
		}
		
	
		
	}

}
