package Steps;

import java.util.ArrayList;

import AddtoCart.ecommerce.AddCartPageActions;
import Base.BaseClass;
import CommonPage.ecommerce.CommonPageActions;
import DashboardPage.ecommerce.DashboardPageActions;
import ProductPage.ecommerce.ProductPageActions;
import RegisterPage.ecommerce.RegisterPageAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
		

public class Steps extends BaseClass{				

      		
    @Given("^Open the Chrome and launch the application$")					
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {		
    	commonPageActions.NavigateToUrl("https://www.nopcommerce.com/en/demo");
		dashboardPageActions.ClickOnHomePage();		
    }		

    @When("^User register for the product$")	
    public void user_register_for_the_product() throws Throwable{
		String oldTab = driver.getWindowHandle();
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(oldTab);
		driver.switchTo().window(newTab.get(0));
		commonPageActions.SwitchToIFrame();
		registerPageAction.ClickOnHomePage();
		productPageActions.ClickOnProductPage();
		productPageActions.ClickOnProductPage1();
		addCartPageActions.ClickOnAddtoCartButton("Build your own computer");
		String winHandleBefore = driver.getWindowHandle();
        for(String winHandle : driver.getWindowHandles())
            driver.switchTo().window(winHandle);
        commonPageActions.SwitchToIFrame();
        addCartPageActions.ClickOnAddtoCartButton1();
        addCartPageActions.ClickOnAddtoCartButton2();
	
        }
    
    @Then("^Close browser$")
	public void close_browser() throws Throwable{
    	driver.close();
    	ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTab.get(0));
		
    }
    
}