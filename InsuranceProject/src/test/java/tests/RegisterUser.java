package tests;

import businessfunctions.BaseClass;
import pagerepository.MainPage;
import pagerepository.RegisterUserAndLoginPage;
import utilityfunctions.RegistrationExcelUtils;

public class RegisterUser extends BaseClass{

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		int noOfRows = RegistrationExcelUtils.getRowCount();

		for (int i = 1; i < noOfRows; i++) {

			String id = RegistrationExcelUtils.getCellData(i, 0);
			System.out.println(id);
			String password=RegistrationExcelUtils.getCellData(i, 1);
			System.out.println(password);
			String name=RegistrationExcelUtils.getCellData(i, 2);
			System.out.println(name);
			String mnumber=RegistrationExcelUtils.getCellData(i, 3);
			System.out.println(mnumber);
			String morf=RegistrationExcelUtils.getCellData(i, 4);
			System.out.println(morf);
			String bday=RegistrationExcelUtils.getCellDataDate(i, 5);
			System.out.println(bday);
			String street=RegistrationExcelUtils.getCellData(i, 6);
			System.out.println(street);
			String location=RegistrationExcelUtils.getCellData(i, 7);
			System.out.println(location);
			String city=RegistrationExcelUtils.getCellData(i, 8);
			System.out.println(city);
			String state=RegistrationExcelUtils.getCellData(i, 9);
			System.out.println(state);
			String zip=RegistrationExcelUtils.getCellData(i, 10);
			System.out.println(zip);
		
		//Opening Browser and Application
		BaseClass.openBrowserWithApplication();
		MainPage.clickOnLoginLink();
		
		//Fill Out Registration Application:
		RegisterUserAndLoginPage.enterRegisterId(id);
		RegisterUserAndLoginPage.enterRegisterName(name);;
		RegisterUserAndLoginPage.enterRegisterPassword(password);
		RegisterUserAndLoginPage.enterMobileNumber(mnumber);
		
		
		//Female or Male:
		if (morf.equals("F")) {
		RegisterUserAndLoginPage.clickFemaleRadiobutton();}
		else if(morf.equals("M")) {
		RegisterUserAndLoginPage.clickMaleRadiobutton();
		}
		
		RegisterUserAndLoginPage.enterBirthDayButton(bday);
		BaseClass.scrollDown();
		RegisterUserAndLoginPage.enterStreetName(street);
		RegisterUserAndLoginPage.enterStreetName2(location);
		RegisterUserAndLoginPage.enterCity(city);
		RegisterUserAndLoginPage.enterState(state);
		RegisterUserAndLoginPage.enterZip(zip);
		//RegisterUserAndLoginPage.clickRegisterButton();
		
		Thread.sleep(5000);
		
		//Logout and Close Browser
		//BaseClass.logoutFromApp();
		BaseClass.closeBrowser();
		}

	}

}
