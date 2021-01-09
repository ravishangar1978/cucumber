package Steps;

import Base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Steps1 extends BaseClass {
	@Given("^Open the Chrome$")
	public void open_the_browser() throws Throwable
	{
		commonPageActions.NavigateToUrl("https://www.nopcommerce.com/en/demo");
		
	}

	@When("^Admin must login$")	
    public void admin_must_login() throws Throwable{
		adminPageActions.ClickOnAdminPage();
		String winHandleBefore = driver.getWindowHandle();
        for(String winHandle : driver.getWindowHandles())
            driver.switchTo().window(winHandle);
        loginpageactions.ClickOnloginbutton();
        
	}
	
   @Then("^sales data$")
   public void sales_data() throws Throwable {
	   salespageactions.ClickOnSalesPage();
   }

   @When("^order data$")
   public void order_data() throws Throwable {
	   orderpageactions.ClickOnOrderPage();
   }
   
   @Then("^logout$")
   public void logout_data() throws Throwable {
	   
	   logoutpageactions.ClickOnLogoutPage();
   }
}