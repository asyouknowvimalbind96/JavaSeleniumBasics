package GivenByMam_Scenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1122 {

	public static void main(String[] args) {
		
		A obj=new B();    /// This is process of   Upcasting
		B rr= (B) obj;     /// This is process of   DownCasting
		
		
		// B bo= (B) new A();
		
		    WebDriver driver=new ChromeDriver();
		    
		    if(driver instanceof ChromeDriver ==true) {
		    	    
		    } else if (driver instanceof FirefoxDriver ) {
	    	    
	        }
		
		
	}

}
