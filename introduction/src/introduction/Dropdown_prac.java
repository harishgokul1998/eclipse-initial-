package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_prac {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement dd = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Thread.sleep(2000);
		Select dropp = new Select(dd);
		dropp.selectByIndex(1);
		System.out.println(dropp.getFirstSelectedOption().getText());
		dropp.selectByValue("AED");
		System.out.println(dropp.getFirstSelectedOption().getText());
		dropp.selectByVisibleText("USD");
		System.out.println(dropp.getFirstSelectedOption().getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for( int i=0; i <8; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@text=\"Madurai (IXM)\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//(a[@value=\"BLR\"])[2]")).click();

	}

}
