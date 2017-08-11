package mli.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public  class CSPage extends LoginObjects
{

	public CSPage(WebDriver driver)
	{
		super(driver);
		
	}
  
 @FindBy (id="BTN_SCREENFLOW")	
 public static WebElement Btn_Journey;
	
 @FindBy (id="Cas_ex1_22")	
 public static WebElement DropDown_Caller_type;
  
 @FindBy (id="Cas_ex1_38")	
 public static WebElement Txt_Callername;
 
 @FindBy (id="SubCategory1")
 public static WebElement Txt_SSC;
 
 @FindBy(xpath=".//*[@id='popupcontainer']/div[4]/div/ul/li")
 public static WebElement Btn_Next;

 @FindBy(xpath="//a[contains(@class,'button-icon-text saveproceedbtn')]/span")
 public static WebElement Btn_SaveandProceed;
 
 @FindBy(xpath=".//*[@id='collap-on1_1']/div[2]/div[2]/div")
 public static WebElement AssignedTo1;

 @FindBy(xpath="//div[contains(@class,'circle--new open')]/span[1]/a")
 public static WebElement CSEJourney;
 

 @FindBy(xpath="//table[contains(@class,'listing')]/tbody/tr[1]/td[1]/a")
 public static WebElement Policy1;
 
 @FindBy(xpath="//a[contains(text(),'Customer Service Request Final')]")
 public static WebElement CSERequest;
 
 @FindBy(xpath="//body[contains(@class,'cke_editable cke_editable_themed cke_contents_ltr cke_show_borders')]")
 public static WebElement Txt_ProblemBox;
 

/* Written By : Kajali Agrawal
 * Written On : 21 Apr'17
 */
 @FindBy(xpath=".//*[@id='collap-on1_1']/div[1]/div[1]/div")
 public static WebElement case_no;
  
 @FindBy(xpath=".//*[@id='collap-on1_1']/div[2]/div[2]/div")
 public static WebElement assignedTo;

 
@FindBy(xpath=".//*[@id='collap-on1_1']/div[79]/div[1]/div")
public static WebElement return_mail_flag;

@FindBy(xpath="html/body/div[3]/div[1]/a/span")
public static WebElement popupclose;

@FindBy(xpath=".//*[@id='saveproceeddialog']/div/input[1]")
public static WebElement continue1;

@FindBy(id="Cas_ex1_22")
public static WebElement callerType;




}

