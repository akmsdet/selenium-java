package selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.edge.EdgeOptions;

public class WebTest {
    //static WebDriver driver;
    private static ThreadLocal<WebDriver> tlDriver= new ThreadLocal<>();
    
    public static synchronized WebDriver getDriver() {
	return tlDriver.get();
    }
    

    public static void main(String arg[]) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\anil.k.mishra\\seleniumDrivers\\msedgedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--no-sandbox");
	options.addArguments("--disable-dev-shm-usage");
	options.addArguments("--remote-allow-origins=*");
	options.addArguments("--disable-gpu");	
	
	EdgeOptions eoptions = new EdgeOptions();
	eoptions.addArguments("log-level=3");
	tlDriver.set(new EdgeDriver(eoptions));
	getDriver().get("https://www.goibibo.com/");
	
	getDriver().findElement(By.xpath("//span[@class='logSprite icClose']")).click();
	getDriver().findElement(By.xpath("//p[@class='sc-jlwm9r-1 dRQhOp']")).click();
	System.out.println("page Title is:" + getDriver().getTitle());
	getDriver().close();
    }
}
