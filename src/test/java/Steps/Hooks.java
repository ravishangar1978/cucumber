package Steps;

import AddtoCart.ecommerce.AddCartPageActions;
import Base.BaseClass;
import CommonPage.ecommerce.CommonPageActions;
import DashboardPage.ecommerce.AdminPageActions;
import DashboardPage.ecommerce.DashboardPageActions;
import ProductPage.ecommerce.ProductPageActions;
import RegisterPage.ecommerce.RegisterPageAction;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;
import login.loginpageActions;
import logout.LogoutPageActions;
import order.OrderPageActions;
import sales.SalesPageActions;

public class Hooks  extends BaseClass{

	@BeforeStep
	public void BeforeStep(Scenario scenario)
	{
		
		//
	}
	
	@Before
	public void BeforeScenario()
	{
		if(driver==null)
		{
			driver=InitilizeDriver();
		}
		
		dashboardPageActions=new DashboardPageActions(driver);
    	commonPageActions=new CommonPageActions(driver);
    	registerPageAction = new RegisterPageAction(driver);
    	productPageActions = new ProductPageActions(driver);
		addCartPageActions = new AddCartPageActions(driver);
		adminPageActions = new AdminPageActions(driver);
		loginpageactions = new loginpageActions(driver);
		salespageactions = new SalesPageActions(driver);
		orderpageactions =  new OrderPageActions(driver);
		logoutpageactions = new LogoutPageActions(driver);

	}
	
	/*@After
	public void AfterScenario()
	{
		driver.close();
	}*/
	@AfterStep
	public void AfterStep() {
		//Any code needs to be executed after each step
	}
	
}
