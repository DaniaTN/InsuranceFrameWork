package businessfunctions;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import configuration.Configuration;
import pagerepository.Dashboard;
import pagerepository.RegisterUserAndLoginPage;

public class BaseClass {
	public static WebDriver driver = null;

	public static void openBrowserWithApplication() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/kaleemahmad/eclipse-workspace/InsuranceProject/src/main/java/drivers/chromedriver");

		ChromeOptions options = new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);
		// ImpicitWait
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(3));
		driver.get(Configuration.getPropertyValue("url"));
		//Maximize browser
		driver.manage().window().maximize();
				
	}

	public static void closeBrowser() {

		driver.close();
		driver.quit();
	}
	
	public static void loginToApplication(String emailId, String password) {
		
		RegisterUserAndLoginPage.enterLoginId(emailId);
		RegisterUserAndLoginPage.enterLoginPassword(password);
		RegisterUserAndLoginPage.clickLoginButton();
	}
	public static void logoutFromApp() {
		
		Dashboard.clickMyAccount();
		Dashboard.clickLogout();	
		
	}
	public static void scrollDown() {
		Actions at = new Actions(driver);
		at.sendKeys(Keys.PAGE_DOWN).build().perform();
	}
	
	}