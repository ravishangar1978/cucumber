package DashboardPage.ecommerce;

import org.openqa.selenium.WebDriver;

public class DashboardPageActions {
	
	WebDriver driver;
	DashboardPage dashboardPage;
	
	public DashboardPageActions(WebDriver tmpdriver)
	{
		driver=tmpdriver;
		dashboardPage= new DashboardPage(driver);
	}

	
	public  void ClickOnHomePage()
	{
		dashboardPage.HomeObject().click();
	}

}

