package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "D:\\udemy\\chrome driver\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("test@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("harish212");
		driver.findElement(By.className("submit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());  
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder = 'Name']")).sendKeys("test01");
		driver.findElement(By.cssSelector("input[placeholder = 'Email']")).sendKeys("test02");
		driver.findElement(By.cssSelector("input[placeholder = 'Email']")).clear();
		driver.findElement(By.xpath("//input[@type = 'text'][2]")).sendKeys("testo1");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("98754");
		driver.findElement(By.xpath("//div/button[2]")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	
	
		

	}

}
