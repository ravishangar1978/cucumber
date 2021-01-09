package CommonPage.ecommerce;

import org.openqa.selenium.WebDriver;


public class CommonPageActions {

	WebDriver driver;
	CommonPage commonPage;
	
	public CommonPageActions(WebDriver tmpdriver)
	{
		driver=tmpdriver;
		commonPage= new CommonPage(driver);
	}
	public void NavigateToUrl(String url)
	{
		driver.navigate().to(url);
	}
	
	public void SwitchToIFrame()
	{
		driver.switchTo().frame(0);
	}
	
	
}

