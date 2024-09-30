package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exxter_pra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "D:\\\\udemy\\\\chrome driver\\\\chromedriver-win64\\\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("input#username")).sendKeys("student");
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("Password123");
		driver.findElement(By.cssSelector(".btn")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.className("has-text-align-center")).getText());
		
		

	}

}
