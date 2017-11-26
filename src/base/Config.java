package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import utils.webDriverApi;

public class Config extends webDriverApi {

	
	// this is the configuration class
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hasan\\workspace\\Spring17Framework\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		
	}
}
