package allurereports;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BaseClass {
    public WebDriver driver;
    public Properties prop;
    public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();

    public WebDriver initialize_driver() {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\anil.k.mishra\\seleniumDrivers\\msedgedriver.exe");
	EdgeOptions options = new EdgeOptions();
	options.addArguments("--remote-allow-origins=*");
	options.addArguments("--start-maximized");
	driver = new EdgeDriver(options);
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().deleteAllCookies();
	//driver.manage().window().maximize();
	tdriver.set(driver);
	return getDriver();
    }

    public static synchronized WebDriver getDriver() {
	return tdriver.get();
    }

}
