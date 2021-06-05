//Ravi file
package AddtoCart.ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCartPage {


	WebDriver driver;
	WebDriverWait wait;
 

	public AddCartPage(WebDriver tmpdriver)
	{
		driver=tmpdriver;
		 wait = new WebDriverWait(driver,30);
	}
		
	public WebElement AddToCart(String productName)
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2/a[contains(text(),'"+productName+"')]/../../div/div//input[@class=\"button-2 product-box-add-to-cart-button\"]")));
		 
	}		 
			 
	public WebElement AddToCart1()
	{
		
		 
		  return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"product_attribute_3_6\"]")));
			
		
	}		 		 
	  
	public WebElement AddToCart2()
	{
		
		  
		
		 return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"add-to-cart-button-1\"]")));	
		
	}		
}
