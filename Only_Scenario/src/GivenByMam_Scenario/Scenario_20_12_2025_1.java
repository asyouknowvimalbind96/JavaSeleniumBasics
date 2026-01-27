package GivenByMam_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Scenario_20_12_2025_1 extends LoginClass {
	
	public static void main(String[] args) throws InterruptedException {
		Login();
		String ExpectedPageTitle="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		Thread.sleep(4000);
		String gettitle=driver.getTitle();	
		if(ExpectedPageTitle.equals(gettitle)) {
			System.out.println("Expected and Actual Value Matched Validation  passed > "+gettitle);
		}else {
			System.out.println("Expected and Actual Value not Matched Validation  Failed >");
		}
		
		//driver.close();
	}

}
