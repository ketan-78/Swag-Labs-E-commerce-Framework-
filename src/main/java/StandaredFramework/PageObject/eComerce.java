package StandaredFramework.PageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StandardFramework.ReusableComponents.waitHelper;

public class eComerce extends waitHelper{

	WebDriver driver;
	public eComerce(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='inventory_item_description'] //div/a/div")
	List<WebElement> items;
	@FindBy(id="user-name")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="login-button")
	WebElement login;
	@FindBy(css=".btn_inventory")
	List<WebElement> addToCart;
	@FindBy(css=".shopping_cart_link")
	WebElement cart;
	@FindBy(css=".checkout_button")
	WebElement checkout;
	@FindBy(id="remove-sauce-labs-backpack")
	WebElement remove1;
	@FindBy(id="react-burger-menu-btn")
	WebElement menu;
	@FindBy(id="logout_sidebar_link")
	WebElement logout;
	@FindBy(id="first-name")
	WebElement fname;
	@FindBy(id="last-name")
	WebElement lname;
	@FindBy(id="postal-code")
	WebElement code;
	@FindBy(id="continue")
	WebElement Continue;
	@FindBy(css=".summary_info [class*='summary']")
	List<WebElement> summary;
	@FindBy(id="finish")
	WebElement finish;
	@FindBy(css=".complete-header")
	WebElement done;
	public void logIn(Object object,Object object2)
	{
		username.sendKeys(String.valueOf(object));
		password.sendKeys(String.valueOf(object2));
		login.click();
	}
	
	By grandparent=By.xpath("//../../following-sibling::div/button");
	
	public void itemSelection(Object object)
	{
		hardWait();
		@SuppressWarnings("unchecked")
		ArrayList<String> itm=(ArrayList<String>)object;
		for(int i=0;i<items.size();i++)
		{
			if(itm.contains(items.get(i).getText()))
			{
				items.get(i).findElements(grandparent).get(i).click();
			}
		}
	}
	
	public void yourCart()
	{
		hardWait();
		cart.click();
		checkout.click();
	}
		
	public void details(Object object,Object object2,Object object3)
	{
		hardWait();
		fname.sendKeys(String.valueOf(object));
		lname.sendKeys(String.valueOf(object2));
		code.sendKeys(String.valueOf(object3));
		Continue.click();
		hardWait();
	}
	
	public void summaryInfo()
	{
		for(int i=0;i<summary.size();i++)
		{
			System.out.println(summary.get(i).getText());
		}
		finish.click();
		System.out.println(done.getText());
		menu.click();
		hardWait();
		logout.click();
	}
}
