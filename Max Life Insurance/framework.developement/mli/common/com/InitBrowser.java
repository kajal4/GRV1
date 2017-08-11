package mli.common.com;

import mli.pom.com.CSPage;
import mli.pom.com.ClaimPage;
import mli.pom.com.Contract_Search_Objects;
import mli.pom.com.GrvObjects;
import mli.pom.com.LoginObjects;
import mli.pom.com.PoscfObjects;
import mli.pom.com.ScrutinyObjects;
import mli.pom.com.TicketSearchObjects;
import mli.pom.com.ApproverObjects;
import mli.repository.com.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

public class InitBrowser implements Properties
{
	public static WebDriver driver=null;
	
	@BeforeMethod
	public void launchBrowser()
	{
		
	System.setProperty(ChromeWebDriver, ChromeDriverPath_kajali);
	driver =new ChromeDriver();
	ChromeOptions option= new ChromeOptions();
	option.addArguments("--start-maximized");
	driver.get(MaxProdSAURL);
	new LoginObjects(driver);
	new CSPage(driver);
	new Contract_Search_Objects(driver);
	new ScrutinyObjects(driver);
	new TicketSearchObjects(driver);
	new GrvObjects(driver);
	new PoscfObjects(driver);
	new ApproverObjects(driver);
	new ClaimPage(driver);
	}
	
	
	
}
