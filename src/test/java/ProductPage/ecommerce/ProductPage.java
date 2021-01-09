package ProductPage.ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
	
	 
		WebDriver driver;
		WebDriverWait wait;
	 

		public ProductPage(WebDriver tmpdriver)
		{
			driver=tmpdriver;
			 wait = new WebDriverWait(driver,30);
		}
			
			public WebElement ProductObject()
			{
				
				return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Computers')]")));
			}
			public WebElement ProductObject1()
			{
				
				return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Desktops')]")));
				 
			}
}


