package pagerepository;

import org.openqa.selenium.By;

import businessfunctions.BaseClass;

public class InsuranceApplicationPage extends BaseClass {

	static By amtCoverage = By.name("ctl00$YMContents$LQCoverage");
	static By txtZip = By.name("ctl00$YMContents$LQZip");
	static By birthDate = By.name("LQDob");
	static By btnMale=By.xpath("//*[@id=\"LQForm\"]/div[3]/div[1]/div[1]/label");
	static By btnFemale=By.xpath("//*[@id=\"LQForm\"]/div[3]/div[1]/div[2]/label");
	static By txtHeight=By.name("LQHeightF");
	static By txtInches=By.name("LQHeightI");
	static By txtWeight=By.name("LQWeight");
	static By btnCigY=By.xpath("//*[@id=\"LQForm\"]/div[4]/div[2]/div[1]/label");
	static By btnCigN=By.xpath("//*[@id=\"LQForm\"]/div[4]/div[2]/div[2]/label");
	static By btnEmpY=By.xpath("//*[@id=\"LQForm\"]/div[5]/div[2]/div[1]/label");
	static By btnEmpN=By.xpath("//*[@id=\"LQForm\"]/div[5]/div[2]/div[2]/label");
	static By btnOption1=By.xpath("//*[@id=\"LQForm\"]/div[6]/label");
	static By btnOption2=By.xpath("//*[@id=\"LQForm\"]/div[7]/label");
	static By btnOption3=By.xpath("//*[@id=\"LQForm\"]/div[8]/label");
	static By btnOption4=By.xpath("//*[@id=\"LQForm\"]/div[9]/label");
	static By btnOption5=By.xpath("//*[@id=\"LQForm\"]/div[10]/label");
	static By btnGetQuote=By.xpath("//*[@id=\"LQBtn\"]");
	

	public static void selectAmtCoverage(String amount) {

		driver.findElement(amtCoverage).sendKeys(amount);

	}

	public static void enterZip(String zip) {

		driver.findElement(txtZip).sendKeys(zip);

	}
	public static void enterBirthDay(String  date) {

		driver.findElement(birthDate).sendKeys(date);
	}
	public static void selectMale() {

		driver.findElement(btnMale).click();

	}
	public static void selectFemale() {

		driver.findElement(btnFemale).click();

	}
	public static void enterHeight(String height) {

		driver.findElement(txtHeight).sendKeys(height);

	}
	public static void enterinches(String inches) {

		driver.findElement(txtInches).sendKeys(inches);

	}
	public static void enterWeight(String weight) {

		driver.findElement(txtWeight).sendKeys(weight);

	}
	public static void selectCigY() {

		driver.findElement(btnCigY).click();

	}
	public static void selectCigN() {

		driver.findElement(btnCigN).click();

	}
	public static void selectEmpY() {

		driver.findElement(btnEmpY).click();

	}
	public static void selectEmpN() {

		driver.findElement(btnEmpN).click();

	}
	public static void selectOption1() {

		driver.findElement(btnOption1).click();

	}
	public static void selectOption2() {

		driver.findElement(btnOption2).click();

	}
	public static void selectOption3() {

		driver.findElement(btnOption3).click();

	}
	public static void selectOption4() {

		driver.findElement(btnOption4).click();

	}
	public static void selectOption5() {

		driver.findElement(btnOption5).click();

	}
	public static void selectGetQuote() {

		driver.findElement(btnGetQuote).click();
	}

}
