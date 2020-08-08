import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		// Create an account
		
		WebElement firstname=driver.findElement(By.name("firstname"));
		firstname.sendKeys("Shilakha");
		WebElement surname=driver.findElement(By.name("lastname"));
		surname.sendKeys("Saini");
		WebElement email=driver.findElement(By.name("reg_email__"));
		email.sendKeys("shekhusaini30@gmail.com");
		WebElement password=driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("Test@123");
		WebElement sex=driver.findElement(By.id("u_0_6"));
		sex.click();
		

	}

}
