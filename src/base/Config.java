package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.webDriverApi;

public class Config extends webDriverApi {


	// this is the configuration class

	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hasan\\workspace\\Spring17Framework\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void tearDown (){
		//driver.quit();
	}
}
