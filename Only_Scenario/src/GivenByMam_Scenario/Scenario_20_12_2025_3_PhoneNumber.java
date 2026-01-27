package GivenByMam_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario_20_12_2025_3_PhoneNumber extends LoginClass {

	public static void main(String[] args) throws InterruptedException {
		Login();
		driver.findElement(By.xpath("(//a[text()='edit'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7800628135");
		driver.findElement(By.xpath("//input[@accesskey='S']")).click();
		
		

	}

}
