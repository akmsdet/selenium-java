package allurereports;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


@Listeners({TestAllureListener.class})
public class GoogleTest {
    public WebDriver driver;
    BaseClass base;

    @BeforeMethod
    public void setUp() {
	base= new BaseClass();
	driver = base.initialize_driver();
	driver.get("https://google.co.in");
	driver.manage().window().maximize();
    }

    @Test(priority = 1, testName="getTitle")
    public void getTestTitle() {
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Google");
    }
    

    @Test(priority = 2, testName="getUrl")
    public void getTestUrl() {
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	Assert.assertEquals(currentUrl, "Google");
    }


    @Test(priority = 3, testName="getUrl")
    public void getTestSrc() {
	String currentUrl = driver.getPageSource();
	System.out.println(currentUrl);
    }
    @AfterMethod
    public void tearDown() {
	if (driver != null) {
	    driver.quit();
	}
    }

}
