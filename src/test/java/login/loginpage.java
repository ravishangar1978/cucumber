package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginpage {
	
         WebDriver driver;
	 WebDriverWait wait;
	 
	  public loginpage(WebDriver tmpdriver)
		{      
                       
			driver=tmpdriver;
			 wait = new WebDriverWait(driver,30);
		}
     
	public WebElement loginObject() {
				
		// my first comment
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/input")));
	}
	
}
	


