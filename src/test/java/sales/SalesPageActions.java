package sales;

import org.openqa.selenium.WebDriver;

import DashboardPage.ecommerce.DashboardPage;



public class SalesPageActions {
	
	WebDriver driver;
	SalesPage salespage;
	
	public SalesPageActions(WebDriver tmpdriver)
	{
		driver=tmpdriver;
		salespage= new SalesPage(driver);
	}

	
	public  void ClickOnSalesPage()
	{
		salespage.SalesObject().click();
		
	}

}
