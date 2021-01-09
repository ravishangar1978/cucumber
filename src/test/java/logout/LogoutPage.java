package logout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage {
	WebDriver driver;
	 WebDriverWait wait;
	 
	  public LogoutPage(WebDriver tmpdriver)
		{
			driver=tmpdriver;
			 wait = new WebDriverWait(driver,30);
		}
    
	public WebElement LogoutObject() {
				
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[1]/div/div/ul/li[3]/a")));
		
	}

}
