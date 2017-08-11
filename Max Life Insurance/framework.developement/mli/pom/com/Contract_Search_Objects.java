package mli.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contract_Search_Objects extends LoginObjects
{
	
	public Contract_Search_Objects(WebDriver driver) 
	{
		super(driver);
		
	}
@FindBy (xpath=".//*[@id='js-vnav']/li[2]/a/i/span") //Click on Sales Icon
public static WebElement icon_sales;

@FindBy (xpath=".//span[contains(text(),'Contracts')]") //Click on Contracts Icon Button
public static WebElement icon_contracts;

@FindBy (xpath="//ul[@id='js-vnav']/li[2]/a") //Click on Quick Link Icon 
public static WebElement QuickLink_icon;


@FindBy (xpath=".//*[@id='js-vnav']/li[2]/div/div[2]/ul/li[3]/a/span") //Click on Policy Search Icon Button
public static WebElement PolicySearch_icon;

@FindBy (id="m_c_vf_10057166_txt") //Click on Policy Number
public static WebElement txt_PolicyNumber;

@FindBy (id="m_c_btnFetch") //Click on Fetch Data
public static WebElement btn_FetchData;

@FindBy (id="m_c_vf_chk10057166") //Click on Policy ID Check box
public static WebElement CheckBox1;

@FindBy (id="m_c_vf_chk21870") //Click on First Name Check box
public static WebElement CheckBox2;

@FindBy (id="m_c_vf_chk23092") //Click on Client ID Check Box
public static WebElement CheckBox3;

@FindBy (id="m_c_vf_21871") //Click on Last Name Check box
public static WebElement CheckBox4;

@FindBy (id="m_c_vf_chk21863") //Click on DOB Check box
public static WebElement CheckBox5;

@FindBy (id="m_c_vf_chk23756") //Click on Pin Code Check box
public static WebElement CheckBox6;

@FindBy (id="m_c_btnv") //Click on Validate Button
public static WebElement btn_Validate;

@FindBy (id="btnok") //Click on Validate Button
public static WebElement btn_ValidateYes;

@FindBy(id="m_c_vf_10057166")
public static WebElement Checkbox1_Policy_ID;

@FindBy(xpath=".//*[@id='m_c_vf_21870']")
public static WebElement Checkbox2_First_Name;

@FindBy(xpath=".//*[@id='m_c_vf_23092']")
public static WebElement Checkbox3_Client_ID;

@FindBy(xpath=".//*[@id='m_c_vf_21871']")
public static WebElement Checkbox4_Last_Name;

@FindBy(xpath=".//*[@id='m_c_vf_21871']")
public static WebElement Checkbox5_DOB;

@FindBy(xpath=".//*[@id='m_c_vf_23756']")
public static WebElement Checkbox6_PIN_Code;

@FindBy(xpath=".//*[@id='js-vnav']/li[2]/a/i")
public static WebElement quicklink;


/*****************************************
 * 
 * Written date : 20 april
 * Written By : Manish
 * 
 *************************************/


	
}
