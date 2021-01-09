package DashboardPage.ecommerce;

import org.openqa.selenium.WebDriver;

public class AdminPageActions {
	
	WebDriver driver;
	AdminPage adminPage;
	
	public AdminPageActions(WebDriver tmpdriver)
	{
		driver=tmpdriver;
		adminPage= new AdminPage(driver);
	}

	
	public  void ClickOnAdminPage()
	{
		adminPage.AdminObject().click();
	}


}
