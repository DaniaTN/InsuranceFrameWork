package pagerepository;

import org.openqa.selenium.By;

import businessfunctions.BaseClass;

public class UpdateProfilePage extends BaseClass {

	static By txtUName = By.name("ctl00$YMContents$UName");
	static By txtMNumber = By.name("ctl00$YMContents$UMobile");
	static By txtUStreetNumber = By.name("ctl00$YMContents$UAddress_1");
	static By txtULocation = By.name("ctl00$YMContents$UAddress_2");
	static By txtUCity = By.name("ctl00$YMContents$UCity");
	static By txtUState = By.name("ctl00$YMContents$UState");
	static By txtUZip = By.name("ctl00$YMContents$UZip");
	static By btnUpdateProfile=By.xpath("//*[@id=\"UBtn\"]");

	
	public static void updateName(String name) {
		
		driver.findElement(txtUName).clear();
		driver.findElement(txtUName).sendKeys(name);
	}

	public static void updateMNumber(String number) {
		
		driver.findElement(txtMNumber).clear();
		driver.findElement(txtMNumber).sendKeys(number);
	}
	public static void updateStreetName(String streetname) {
		
		driver.findElement(txtUStreetNumber).clear();
		driver.findElement(txtUStreetNumber).sendKeys(streetname);
	}
	public static void updateLocation(String location) {
		
		driver.findElement(txtULocation).clear();
		driver.findElement(txtULocation).sendKeys(location);
	}
	public static void updateCity(String city) {
		
		driver.findElement(txtUCity).clear();
		driver.findElement(txtUCity).sendKeys(city);
	}
	public static void updateState(String state) {
		
		driver.findElement(txtUState).clear();
		driver.findElement(txtUState).sendKeys(state);
	}
	public static void updateZip(String zip) {
		
		driver.findElement(txtUZip).clear();
		driver.findElement(txtUZip).sendKeys(zip);
	}
	public static void clickUpdateProfile() {

		driver.findElement(btnUpdateProfile).click();
	}
	
	
	

}
