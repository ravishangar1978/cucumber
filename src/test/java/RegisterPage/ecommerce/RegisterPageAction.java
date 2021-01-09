package RegisterPage.ecommerce;

import org.openqa.selenium.WebDriver;

public class RegisterPageAction {
	WebDriver driver;
	RegisterPage registerPage;
	
	public  RegisterPageAction(WebDriver tmpdriver)
	{
		driver=tmpdriver;
		registerPage= new RegisterPage(driver);
	}

	
	public  void ClickOnHomePage()
	{
		registerPage.RegisterObject().click();
		
	}


}
