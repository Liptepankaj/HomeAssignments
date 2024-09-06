package week3.ListAssignmentsW3;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ajio {

	String searchBox = "bags";
	String gender = "Men";
	String category = "Fashion Bags";

	ChromeDriver driver = new ChromeDriver();
	public  void launchBrowser() {
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void uiOperations() throws InterruptedException {
		WebElement srchBox = driver.findElement(By.xpath("//input[@placeholder='Search AJIO']"));
		srchBox.sendKeys(searchBox, Keys.ENTER);
		
		WebElement gnder = driver.findElement(By.xpath("//label[contains(text(),'"+gender+"')]"));
		gnder.click();
		
		Thread.sleep(3000);
		
		WebElement ctgry = driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]"));
		ctgry.click();
		
		Thread.sleep(3000);
		WebElement itemsfound = driver.findElement(By.xpath("//div[contains(@aria-label,\"Items Found\")]/strong"));
		String founditems = itemsfound.getText();
		System.out.println("Total Number of Bags Found = "+founditems);
		
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class=\"brand\"]/strong"));
		for(WebElement brand : brands) {
			String availableBrand = brand.getText();
			System.out.println(availableBrand);
		}
		
		List<WebElement> bagNames = driver.findElements(By.xpath("//div[@class=\"nameCls\"]"));
		for(WebElement bagName : bagNames) {
			String bagsName = bagName.getText();
			System.out.println(bagsName);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Ajio aj = new Ajio();
		aj.launchBrowser();
		aj.uiOperations();
	}

}
