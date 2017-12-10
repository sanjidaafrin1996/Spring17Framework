package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SkipDisable {
	
	// Aim for this class
	// =============================
	// skipping the test
	// Disable the test
	
	WebDriver driver; 

	@BeforeMethod
	public void beforeClass(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hasan\\workspace\\Spring17Framework\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test ()
	public void goingToSkip(){
		driver.get("https://www.google.com");
		System.out.println("This test has been skipped");
		throw new SkipException ("Skipping because this test is no longer needed!!");
		// selenium code
	
	}
	
	@Test (enabled=false)
	public void goingToDisable(){
		driver.get("https://www.facebook.com");
		System.out.println("This test has been disabled");
	}
	
	@AfterMethod
	public void afterMethod (){
		driver.close();
		driver.quit();
		
	}
	

}
