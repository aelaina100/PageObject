package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.faceBookLoginPage;

public class FacebookLogin {
	
	@Test
	public void loginTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Third_Party_Browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.get("https://www.facebook.com/");
		
		faceBookLoginPage fb= new faceBookLoginPage(driver);
		fb.username_field().sendKeys("automation@ahmad.ca");
		fb.password_field().sendKeys("Some random password");
		fb.login_button().click();
		
	}

}
