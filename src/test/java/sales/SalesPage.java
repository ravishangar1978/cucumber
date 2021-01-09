package sales;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesPage {
	
	 WebDriver driver;
	 WebDriverWait wait;
	 
	  public SalesPage(WebDriver tmpdriver)
		{
			driver=tmpdriver;
			 wait = new WebDriverWait(driver,30);
		}
     
	public WebElement SalesObject() {
				
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[2]/div/ul/li[3]/a/span")));
		
	}
	
}


