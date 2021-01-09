package DashboardPage.ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
	
	 WebDriver driver;
	 WebDriverWait wait;
	 
	  public DashboardPage(WebDriver tmpdriver)
		{
			driver=tmpdriver;
			 wait = new WebDriverWait(driver,30);
		}
     
	public WebElement HomeObject() {
				
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//SPAN[@class='button-text'][text()='Frontend']")));
	}
	
}
	
	

