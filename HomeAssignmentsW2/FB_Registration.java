package week2.HomeAssignmentsW2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FB_Registration {

	public static void main(String[] args) {

		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement createButton = driver.findElement(By.xpath("//a[contains(@ajaxify,'reg/spotlight')]"));
		createButton.click();

		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("Pankaj");

		WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
		surname.sendKeys("Lipte");

		WebElement mobNum = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobNum.sendKeys("8668455050");

		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		password.sendKeys("Abcd@123");

		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);
		d.selectByValue("17");

		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByIndex(6);

		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByVisibleText("1995");

		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();

	}

}
