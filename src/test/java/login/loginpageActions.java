package login;

import org.openqa.selenium.WebDriver;



public class loginpageActions {
	WebDriver driver;
	loginpage login;
	
	public loginpageActions(WebDriver tmpdriver)
	{
		driver=tmpdriver;
		login= new loginpage(driver);
	}

	
	public  void ClickOnloginbutton()
	{
		login.loginObject().click();
	}

}
