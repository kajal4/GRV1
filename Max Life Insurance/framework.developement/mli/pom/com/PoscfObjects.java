package mli.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PoscfObjects extends LoginObjects
{

	public PoscfObjects(WebDriver driver)
	{
		super(driver);
	}

@FindBy(xpath=".//p[contains(@title,'Forwardee Section')]")	
public static WebElement Forwardee_section;

@FindBy(id="HtmlText_24594")	
public static WebElement Forwardee1_comment;

@FindBy(xpath="//*[@id='cas_ex10_11imgpick']/i")	
public static WebElement Forwardee1_decision_picker;	

@FindBy(id="TxtSearch")	
public static WebElement Forwardee1_decision_txt;	

@FindBy(xpath=".//*[@id='imgsearch']/i")	
public static WebElement Decision_search_icon;

@FindBy(xpath="//a[contains(text(),'Accept')]")	
public static WebElement Decision;

@FindBy(xpath="//a[contains(text(),'Approved')]")	
public static WebElement Decision1;

@FindBy(id="btnSave_-1_43802_783cf681-c1ef-4e2f-9f27-b574b0c73c8f")	
public static WebElement POSCFsave;

@FindBy (id="HtmlText_24595")
public static WebElement Comment2;
  
@FindBy(xpath=".//*[@id='cas_ex10_35imgpick']/i")	
public static WebElement Forwardee2_decision_picker;	

}
