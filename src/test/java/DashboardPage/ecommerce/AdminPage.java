package DashboardPage.ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage {
	WebDriver driver;
	 WebDriverWait wait;
	 
	  public AdminPage(WebDriver tmpdriver)
		{
			driver=tmpdriver;
			 wait = new WebDriverWait(driver,30);
			
		}
    
	public WebElement AdminObject() {
	

		
	return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ph-topic\"]/div[2]/div/div[1]/div[2]/div/div/a[1]/span")));	
	}

}
