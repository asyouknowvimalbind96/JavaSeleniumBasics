package GivenByMam_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginClass {
	static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {
		
		Login();

	}
	public static void Login() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin1");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		Thread.sleep(2000);
	}
}
