package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLunching {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		String url="http://www.Amazon.com";
		driver.get(url);
		By obj1=By.name("field-keywords");
		WebElement searchBox=driver.findElement(obj1);
		
		searchBox.sendKeys("iphone 15 pro max");
		By obj2=By.xpath("//input[@value='Go']");
		WebElement clickGoButton= driver.findElement(obj2);
		clickGoButton.click();
		
		
		/* sabse pahale ham chromeDriver ka object bana kar ke lunch kiye hai
		 *  
		 * fir ham ek String class ka object bana kar ek url name
		 *  ke variable me amazon ka URL store kiye hai fir ham 
		 *  chromeDriver ke object ke Reference ke sath dot laga kar 
		 *  chromeDriver ke ek "Get"method  ko call kiye hai aur fir parameter 
		 *  me ham String class ka object bhejte hai 
		 *  
		 *  fir ham By class object banata nahi hai lekin alag tarike se By class 
		 *  ka object bana ke ham By class ke static "name"  naam ke method ko call
		 *  kiye hai aur usame ham parameter me String class ka object bhejte hai 
		 *  String class ke object matlab  "Atribute ki value bhejte hai "
		 *  
		 *  fir ham 
		 *  chromeDriver ke object ke Reference ke sath dot laga kar 
		 *  chromeDriver ke ek "findElement "naam ke method  ko call kiye hai aur fir parameter 
		 *  me ham String class ka object bhejte hai jo ki hamane upar vali line me
		 *  object bana ke usme uska variable daal diye hai aur fir findElement
		 *  WebElement class ka object return karta hai tab ham esiliye uska type
		 *  WebElement dete hai fir ham use kisi variable me store kar lete hai 
		 *  
		 *  
		 *  
		 *  
		 *   
		 * 
		 * 
		 * 
		 */
		

	}

}
