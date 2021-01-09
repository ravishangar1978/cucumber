package RegisterPage.ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
	
	
	
WebDriver driver;
WebDriverWait wait;

public RegisterPage(WebDriver tmpdriver)
{
	driver=tmpdriver;
	 wait = new WebDriverWait(driver,30);
}
	
	public WebElement RegisterObject()
	{
		
		 return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Log in')]")));
		 
		 
		 
		 
		 }
	
}