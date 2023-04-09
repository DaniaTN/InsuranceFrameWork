package pagerepository;

import org.openqa.selenium.By;
import businessfunctions.BaseClass;

public class MainPage extends BaseClass{
	
	static By LoginLink = By.xpath("/html/body/header/nav/div/ul/li[5]/a");
	
	public static void clickOnLoginLink() {
		driver.findElement(LoginLink).click();
	}
	
}
