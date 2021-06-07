package order;

import org.openqa.selenium.WebDriver;

import sales.SalesPage;

public class OrderPageActions {
	WebDriver driver;
	OrderPage orderpage;
	// order comment
	public OrderPageActions(WebDriver tmpdriver)
	{
		driver=tmpdriver;
		orderpage= new OrderPage(driver);
	}

	
	public  void ClickOnOrderPage()
	{
		orderpage.OrderObject().click();
		
	}
}
