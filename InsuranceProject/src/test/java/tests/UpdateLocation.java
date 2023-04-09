package tests;

import businessfunctions.BaseClass;
import configuration.Configuration;
import pagerepository.Dashboard;
import pagerepository.MainPage;
import utilityfunctions.LocationExcelUtils;

public class UpdateLocation extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int noOfRows = LocationExcelUtils.getRowCount();

		for (int i = 1; i < noOfRows; i++) {

			String zip = LocationExcelUtils.getCellData(i, 0);
			System.out.println(zip);

			// Opening browser and application and logging in:
			BaseClass.openBrowserWithApplication();
			MainPage.clickOnLoginLink();
			BaseClass.loginToApplication(Configuration.getPropertyValue("username"),
					Configuration.getPropertyValue("password"));
			Thread.sleep(5000);

			// Navigating to updating the location page:
			Dashboard.clickLocationButton();
			Thread.sleep(2000);
			Dashboard.enterLocation(zip);
			Thread.sleep(2000);
			Dashboard.clickSubmit();
			Thread.sleep(2000);

			// Logging Out and Closing Browser:
			BaseClass.logoutFromApp();
			BaseClass.closeBrowser();
		}

	}

}
