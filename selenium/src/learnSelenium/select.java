package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;

public class select {
	
	
	public select(WebElement we) throws Exception {
		String extagname="select";
		String Atagname=we.getTagName();
		if(!Atagname.equals(extagname)) {
			throw UnexpectedTagNameException();
		}
		
		
	}
	
	
	

	private Exception UnexpectedTagNameException() {
		// TODO Auto-generated method stub
		return null;
	}




	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		WebElement weusername=driver.findElement(By.name("user_name"));
		WebElement weuser=null;//=driver.findElement(By.name("user_name"));
		Select selobj=new Select(weusername);

	}

}
