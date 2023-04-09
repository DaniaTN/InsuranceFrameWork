package pagerepository;

import org.openqa.selenium.By;

import businessfunctions.BaseClass;

public class ChooseInsurance extends BaseClass{
	
	static By btnPayPremium=By.xpath("/html/body/main/section/div/div[2]/div/div/div/table/tbody/tr/td[5]/button");
	
	public static void clickPayPremium() {
		driver.findElement(btnPayPremium).click();
	}

}
