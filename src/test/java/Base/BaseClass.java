package Base;

import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import AddtoCart.ecommerce.AddCartPageActions;

import CommonPage.ecommerce.CommonPageActions;
import DashboardPage.ecommerce.AdminPageActions;
import DashboardPage.ecommerce.DashboardPageActions;
import ProductPage.ecommerce.ProductPageActions;
import RegisterPage.ecommerce.RegisterPageAction;
import io.github.bonigarcia.wdm.WebDriverManager;
import login.loginpageActions;
import logout.LogoutPageActions;
import order.OrderPageActions;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import sales.SalesPageActions;


public class BaseClass {
	public static WebDriver driver;	
	public static DashboardPageActions dashboardPageActions;
	public static RegisterPageAction registerPageAction;
	public static CommonPageActions commonPageActions;
	public static ProductPageActions productPageActions;
	public static AddCartPageActions addCartPageActions;
	public static AdminPageActions adminPageActions;
	public static loginpageActions loginpageactions;
	public static SalesPageActions salespageactions;
	public static OrderPageActions orderpageactions;
	public static LogoutPageActions logoutpageactions;
	
	public WebDriver InitilizeDriver()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.nopcommerce.com/en/demo");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(120,TimeUnit.SECONDS);
		return driver;
	}

    public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
        TakesScreenshot scrShot =((TakesScreenshot)webdriver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(fileWithPath);
        FileUtils.copyFile(SrcFile, DestFile);
        
        Screenshot Screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(webdriver);

        ImageIO.write(Screenshot.getImage(), "jpg", new File("c://myassign//test.jpg"));
        
        WebElement ele=webdriver.findElement(By.xpath("(//input[contains(@value,'Add to Cart')]"));
        
        Screenshot Screenshot1 = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(webdriver,ele);
        
        ImageIO.write(Screenshot1.getImage(), "jpg", new File("c://myassign//test.jpg"));

        
          }
}
