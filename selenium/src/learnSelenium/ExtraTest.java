package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExtraTest {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		
		By byuser=By.xpath("//input[@name='user_name']");
		WebElement weUserName= driver.findElement(byuser); 
		weUserName.sendKeys("admin");
		
		By bypassword=By.xpath("//input[@name='user_password']");
		WebElement weUserpassword= driver.findElement(bypassword);
		weUserpassword.sendKeys("admin1");
		
		By bylogin=By.xpath("//input[@type='submit']");
		WebElement welogin=driver.findElement(bylogin);
		welogin.click();
		
		By byPlushClick=By.xpath("(//img[@style='cursor:pointer;'])[1]");
		WebElement wePlushClick=driver.findElement(byPlushClick);
		wePlushClick.click();
		
		By byDropDownOnNoteClick=By.xpath("(//a[@class='drop_down'])[4]");
		WebElement weDropDownOnNoteClick=driver.findElement(byDropDownOnNoteClick);
		weDropDownOnNoteClick.click();
		
		By byWindowName=By.xpath("//input[@name='stufftitle']");
		WebElement weWindowName=driver.findElement(byWindowName);
		weWindowName.sendKeys("Project creat By Vimal Bind (My Project is Selenium Learning)");
		
		By byClickSaveButton=By.xpath("(//input[@name='save'])[1]");
		WebElement weClickSaveButton=driver.findElement(byClickSaveButton);
		weClickSaveButton.click();
		
		
		WebElement weClickToEdit2=driver.findElement(By.xpath("//textarea[@id='notebook_textarea_22']"));
		Actions act=new Actions(driver);
		
		act.doubleClick(weClickToEdit2).build().perform();
		
		WebElement weFillDetail=driver.findElement(By.xpath("//textarea[@id='notebook_textarea_19']"));
		weFillDetail.sendKeys("Today i practice other topic by given sir and i want fill"
				+ " deatil right to right and i need clicnt detail becouse i can good practice "
				+ "and i want made good learner after that i good work in company and good parformace"
				+ "and i should be appeare good worker");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}
/*
 *      By byClickSaveButton=By.xpath("");
		WebElement weClickSaveButton=driver.findElement(byClickSaveButton);
		weClickSaveButton.click();
 * 
 *		WebElement weClickSaveButton=driver.findElement(By.xpath(""));
		weClickSaveButton.click();
 * 
 * 
 * Today i practice other topic by given sir and i want fill deatil right to right and i need clicnt detail becouse i can good practice and i want made good learner after that i good work in company and good parformaceand i should be appeare good worker
 * 
 * 
 * 
 */
	
	
}
