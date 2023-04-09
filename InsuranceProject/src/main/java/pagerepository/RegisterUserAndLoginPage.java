package pagerepository;

import org.openqa.selenium.By;

import businessfunctions.BaseClass;

public class RegisterUserAndLoginPage extends BaseClass {

	// Login Function Buttons

	static By txtLoginId = By.name("LEmail");
	static By txtLoginPassword = By.name("LPwd");
	static By btnLogin = By.xpath("//*[@id=\"LBtn\"]");

	// Register User Functions
	static By txtRegisterEmail = By.name("REmail");
	static By txtRegisterPassword = By.name("RPwd");
	static By txtRegisterName = By.name("RName");
	static By mNumber = By.name("RMobile");
	static By btnMale = By.xpath("//*[@id=\"RForm\"]/div[3]/div[1]/div[1]/label");
	static By btnFemale = By.xpath("//*[@id=\"RForm\"]/div[3]/div[1]/div[2]/label");
	static By btnDateBirth = By.name("RDob");
	static By txtStreetName=By.name("RAddress_1");
	static By txtStreetName2=By.name("RAddress_2");
	static By txtCity=By.name("ctl00$YMContents$RCity");
	static By txtState=By.name("ctl00$YMContents$RState");
	static By txtZip=By.name("ctl00$YMContents$RZip");
	static By btnRegister=By.xpath("//*[@id=\"RBtn\"]");
	
	

	// Login Methods
	public static void enterLoginId(String emailId) {

		driver.findElement(txtLoginId).sendKeys(emailId);

	}

	public static void enterLoginPassword(String pwd) {

		driver.findElement(txtLoginPassword).sendKeys(pwd);

	}

	public static void clickLoginButton() {

		driver.findElement(btnLogin).click();
	}

	// Registration Methods:

	public static void enterRegisterId(String emailId) {

		driver.findElement(txtRegisterEmail).sendKeys(emailId);

	}

	public static void enterRegisterPassword(String pwd) {

		driver.findElement(txtRegisterPassword).sendKeys(pwd);

	}

	public static void enterRegisterName(String name) {

		driver.findElement(txtRegisterName).sendKeys(name);

	}

	public static void enterMobileNumber(String number) {

		driver.findElement(mNumber).sendKeys(number);

	}

	public static void clickMaleRadiobutton() {

		driver.findElement(btnMale).click();
	}

	public static void clickFemaleRadiobutton() {

		driver.findElement(btnFemale).click();
	}
	public static void enterBirthDayButton(String  date) {

		driver.findElement(btnDateBirth).sendKeys(date);
	}
	public static void enterStreetName(String streetname) {

		driver.findElement(txtStreetName).sendKeys(streetname);

	}
	public static void enterStreetName2(String streetname) {

		driver.findElement(txtStreetName2).sendKeys(streetname);

	}
	public static void enterCity(String city) {

		driver.findElement(txtCity).sendKeys(city);

	}
	public static void enterState(String state) {

		driver.findElement(txtState).sendKeys(state);

	}
	public static void enterZip(String zip) {

		driver.findElement(txtZip).sendKeys(zip);

	}
	public static void clickRegisterButton() {

		driver.findElement(btnRegister).click();
	}

}
