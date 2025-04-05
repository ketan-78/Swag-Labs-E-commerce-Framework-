package StandardFramework.Tests;

import java.io.IOException;
import java.util.HashMap;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import StandardFramework.TestComponents.BaseTest;

public class MainTest extends BaseTest{

	@Test(dataProvider="data")
	public void eComercee(HashMap<Object,Object> data) throws InterruptedException
	{
		eC.logIn(data.get("user"), data.get("pass"));
		eC.itemSelection(data.get("items"));
		eC.yourCart();
		eC.details(data.get("fname"),data.get("lname"),data.get("code"));
		eC.summaryInfo();

	
	}
	@DataProvider
	public Object[][] data() throws IOException
	{
		HashMap<Object, Object> values=getData(System.getProperty("user.dir")+"\\src\\test\\java\\StandardFramework\\Data\\Data.json");
		return new Object[][] {{values}};
	}


}

