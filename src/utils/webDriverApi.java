package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class webDriverApi {
	// web driver apis
	protected WebDriver driver;
	
	public void typeByXpath (String locator, String value){
		driver.findElement (By.xpath(locator)).sendKeys(value);

	}
	// dropdown
	public  void dropDownByXpath (String locator, String text){
		WebElement dropDownListBox = driver.findElement(By.xpath(locator));
		Select clickThis = new Select(dropDownListBox);
		clickThis.selectByVisibleText(text);
			}

}
