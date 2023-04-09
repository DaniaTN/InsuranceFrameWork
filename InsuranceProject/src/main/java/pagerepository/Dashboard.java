package pagerepository;

import org.openqa.selenium.By;

import businessfunctions.BaseClass;

public class Dashboard extends BaseClass {

	// Update Location:
	static By btnLocation = By.xpath("//*[@id=\"lctext\"]");
	static By txtZipCode = By.name("ctl00$mdzip");
	static By btnSubmit = By.xpath("//*[@id=\"MDZBtn\"]");
	

	// Insurance:

	static By btnInsurance = By.xpath("//*[@id=\"dropdown01\"]");
	static By btnApplyforInsurance = By.xpath("//*[@id=\"navbarCollapse\"]/ul/li[2]/div/a");

	// DashBoard, Profile and Logout:
	static By btnDashBoard=By.xpath("//*[@id=\"AuthLink\"]/div/a[1]");
	static By btnMyAccount = By.xpath("/html/body/header/nav/div/ul/li[5]/a");
	static By btnProfile = By.xpath("//*[@id=\"AuthLink\"]/div/a[2]");
	static By btnLogout=By.xpath("//*[@id=\"AuthLink\"]/div/a[3]");
	
	// DashBoard, Profile and Logout Methods:
	public static void clickDashBoard() {
		driver.findElement(btnDashBoard).click();
	}
	public static void clickMyAccount() {

		driver.findElement(btnMyAccount).click();
	}

	public static void clickProfile() {

		driver.findElement(btnProfile).click();
	}

	// Update Location Methods:
	public static void clickLocationButton() {

		driver.findElement(btnLocation).click();
	}

	public static void enterLocation(String zipcode) {
		
		driver.findElement(txtZipCode).clear();
		driver.findElement(txtZipCode).sendKeys(zipcode);

	}

	public static void clickSubmit() {

		driver.findElement(btnSubmit).click();
	}

	// Insurance
	public static void clickonInsurance() {

		driver.findElement(btnInsurance).click();
	}

	public static void clickonApplyforInsurance() {

		driver.findElement(btnApplyforInsurance).click();
	}
	public static void clickLogout() {
		driver.findElement(btnLogout).click();
	}

}
