package tests;

import businessfunctions.BaseClass;
import configuration.Configuration;
import pagerepository.ChooseInsurance;
import pagerepository.Dashboard;
import pagerepository.InsuranceApplicationPage;
import pagerepository.MainPage;
import pagerepository.SubmitInsurance;

public class ApplyForLifeInsurance {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Opening browser and application and logging in:
		BaseClass.openBrowserWithApplication();
		MainPage.clickOnLoginLink();
		BaseClass.loginToApplication(Configuration.getPropertyValue("username"), Configuration.getPropertyValue("password"));
		Thread.sleep(5000);
		
		//Navigating to updating the location page:
		Dashboard.clickonInsurance();
		Dashboard.clickonApplyforInsurance();
		
		//Application for Insurance:
		InsuranceApplicationPage.selectAmtCoverage("$ 5000");
		InsuranceApplicationPage.enterZip("54545");
		InsuranceApplicationPage.enterBirthDay("04/04/1992");
		InsuranceApplicationPage.selectMale();
		InsuranceApplicationPage.enterHeight("5");
		InsuranceApplicationPage.enterinches("3");
		InsuranceApplicationPage.enterWeight("155");
		InsuranceApplicationPage.selectCigN();
		InsuranceApplicationPage.selectEmpY();
		InsuranceApplicationPage.selectOption2();
		InsuranceApplicationPage.selectOption3();
		InsuranceApplicationPage.selectGetQuote();
		
		//Selecting Insurance and Logging Out:
		ChooseInsurance.clickPayPremium();
		Thread.sleep(2000);
		SubmitInsurance.clickPay();
		Thread.sleep(5000);
		
		SubmitInsurance.clickpopUpPayNow();
		
		Thread.sleep(5000);
		
		//closing browser:
		BaseClass.logoutFromApp();
		BaseClass.closeBrowser();

	}

}
