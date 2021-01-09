package ProductPage.ecommerce;

import org.openqa.selenium.WebDriver;

public class ProductPageActions {

	WebDriver driver;
	ProductPage productPage;
	
	public  ProductPageActions(WebDriver tmpdriver)
	{
		driver=tmpdriver;
		productPage= new ProductPage(driver);
	}

	
	public  void ClickOnProductPage()
	{
		productPage.ProductObject().click();
	}

	public  void ClickOnProductPage1()
	{
		productPage.ProductObject1().click();
	}
}

