package mli.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GrvObjects extends LoginObjects
{
	public GrvObjects(WebDriver driver)
	{
		super(driver);
	}

@FindBy(xpath="//p[contains(@title,'Case Owner Comments')]")	
public static WebElement case_owner_section;

@FindBy(id="Cas_ex1_67")	
public static WebElement resolution_ud;

@FindBy(id="Cas_ex1_40")	
public static WebElement resolution_by;

@FindBy(id="cas_ex8_57")	
public static WebElement is_forwarding ;

@FindBy(id="Cas_ex4_43")	
public static WebElement acceptance_status ;

@FindBy(xpath="//body[contains(@class,'cke_editable cke_editable_themed cke_contents_ltr cke_show_borders')]")	
public static WebElement resolution_box ;

@FindBy(id="cas_ex6_67")	
public static WebElement IRDASection;

@FindBy(xpath="//p[contains(@title,'Non-Grievance Comments')]")	
public static WebElement non_grv_section;

@FindBy(xpath="//*[@id='collap-on1_1']/div[13]/div[1]/div")	
public static WebElement tct_status;

}
