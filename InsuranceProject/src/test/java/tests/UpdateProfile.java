package tests;

import businessfunctions.BaseClass;
import configuration.Configuration;
import pagerepository.Dashboard;
import pagerepository.MainPage;
import pagerepository.UpdateProfilePage;


public class UpdateProfile extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Opening browser and application and logging in:
		BaseClass.openBrowserWithApplication();
		MainPage.clickOnLoginLink();
		BaseClass.loginToApplication(Configuration.getPropertyValue("username"),
				Configuration.getPropertyValue("password"));
		Thread.sleep(5000);

		// Going to MyProfile:
		Dashboard.clickMyAccount();
		Dashboard.clickProfile();

		// Updating Information:
		UpdateProfilePage.updateName("Mike");
		UpdateProfilePage.updateMNumber("5555555555");
		UpdateProfilePage.updateStreetName("The secound Street");
		UpdateProfilePage.updateLocation("United States");
		UpdateProfilePage.updateCity("City");
		UpdateProfilePage.updateState("State");
		UpdateProfilePage.updateZip("22408");
		BaseClass.scrollDown();
		Thread.sleep(2000);
		UpdateProfilePage.clickUpdateProfile();

		// Navigating Back to DashbBoard :
		Dashboard.clickMyAccount();
		Dashboard.clickDashBoard();
		Thread.sleep(3000);

		// Logging Out and Closing Browser:
		BaseClass.logoutFromApp();
		BaseClass.closeBrowser();
	}

}
