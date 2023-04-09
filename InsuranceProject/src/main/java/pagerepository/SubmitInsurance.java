package pagerepository;

import org.openqa.selenium.By;

import businessfunctions.BaseClass;

public class SubmitInsurance extends BaseClass{
	
	static By btnPay=By.xpath("/html/body/main/section/div/div/div[2]/div/div/form/div[1]/button");
	
	static By popUpPayNow=By.xpath("//*[@id=\"MDPayBtn\"]");
	
	public static void clickPay() {
		driver.findElement(btnPay).click();
	}
	
	public static void clickpopUpPayNow() {
		driver.findElement(popUpPayNow).click();
	}

}
