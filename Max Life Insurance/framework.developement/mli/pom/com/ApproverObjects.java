package mli.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApproverObjects extends LoginObjects
{

	public ApproverObjects(WebDriver driver)
	{
		super(driver);
		
	}

	@FindBy(id="cas_ex10_88")
	public static WebElement approver_decision;
	
	@FindBy(id="cas_ex10_89")
	public static WebElement approver_comment;
	
	
}
