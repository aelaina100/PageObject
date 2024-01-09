package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class faceBookLoginPage {

WebDriver driver; 
public faceBookLoginPage(WebDriver driver)
{
	this.driver= driver;
}



	By username_field = By.id("email");
	By password_field = By.id("pass");
	By login_button   =    By.cssSelector("[type*= 'submit']");
	
	
	
	public WebElement username_field()
	{
		return driver.findElement(username_field);
	}

   public WebElement password_field()
   {
	   return driver.findElement(password_field);
   }
   
   public WebElement login_button()
   {
	   return driver.findElement(login_button);
   }
   
   
}

