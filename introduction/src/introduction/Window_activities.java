package introduction;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Window_activities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("Webdriver.chrome.driver","\\udemy\\chrome driver\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/");
		driver.navigate().to("https://google.com");
		driver.navigate().back();
		driver.navigate().forward();
		
	}

}
