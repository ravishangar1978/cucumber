package AddtoCart.ecommerce;

import org.openqa.selenium.WebDriver;

public class AddCartPageActions {

	WebDriver driver;
	AddCartPage addCartPage;
	
	public  AddCartPageActions(WebDriver tmpdriver)
	{
		driver=tmpdriver;
		addCartPage= new AddCartPage(driver);
	}

	public void ClickOnAddtoCartButton(String productName)
	{
		addCartPage.AddToCart(productName).click();
	}
	
	public void ClickOnAddtoCartButton1()
	{
		addCartPage.AddToCart1().click();
	}
	
	public void ClickOnAddtoCartButton2()
	{
		addCartPage.AddToCart2().click();
	}


}


