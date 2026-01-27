package GivenByMam_Scenario;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AlertHandling {

	public static void main(String[] args) {
	//	ChromeOptions options=new ChromeOptions();
		//options.addArguments("--start-maximized");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		Actions act=new Actions(driver);
		 
		
		
		
		
	}

}
