package StandardFramework.ReusableComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class waitHelper {
	
	WebDriver driver;
	public waitHelper(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void hardWait() {
	    try 
	    {
	        Thread.sleep(2000);
	    } 
	    catch (InterruptedException e) 
	    {
	        e.printStackTrace();
	    }
	}
}
