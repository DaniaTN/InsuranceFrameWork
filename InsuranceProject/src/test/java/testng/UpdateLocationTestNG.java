package testng;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import businessfunctions.BaseClass;
import configuration.Configuration;
import pagerepository.Dashboard;
import pagerepository.MainPage;
import utilityfunctions.LocationExcelUtils;

public class UpdateLocationTestNG {

	@BeforeMethod
	public static void beforeTest() throws InterruptedException {

		BaseClass.openBrowserWithApplication();
		
	}

	@Test
	public static void updateLocation() throws InterruptedException {

		int noOfRows = LocationExcelUtils.getRowCount();

		for (int i = 1; i < noOfRows; i++) {

			String zip = LocationExcelUtils.getCellData(i, 0);
			System.out.println(zip);
			
			MainPage.clickOnLoginLink();
			BaseClass.loginToApplication(Configuration.getPropertyValue("username"),
					Configuration.getPropertyValue("password"));
			Thread.sleep(5000);

			Dashboard.clickLocationButton();
			Thread.sleep(2000);
			Dashboard.enterLocation(zip);
			Thread.sleep(2000);
			Dashboard.clickSubmit();
			Thread.sleep(2000);
			BaseClass.logoutFromApp();
		}

	}

	@AfterMethod
	public static void afterTest() {
		BaseClass.closeBrowser();
	}

}
