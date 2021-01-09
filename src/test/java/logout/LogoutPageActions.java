package logout;

import org.openqa.selenium.WebDriver;



public class LogoutPageActions {
	WebDriver driver;
	LogoutPage logoutpage;
	
	public LogoutPageActions(WebDriver tmpdriver)
	{
		driver=tmpdriver;
		logoutpage= new LogoutPage(driver);
	}

	
	public  void ClickOnLogoutPage()
	{
		logoutpage.LogoutObject().click();
		
	}
}
