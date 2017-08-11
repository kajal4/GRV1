package mli.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TicketSearchObjects extends LoginObjects
{

	public TicketSearchObjects(WebDriver driver) 
	{
		super(driver);
		
	}

	@FindBy(xpath=".//*[@id='js-vnav']/li[2]/a/i")
	public static WebElement quicklink;
	
	@FindBy(xpath=".//*[@id='js-vnav']/li[2]/div/div[2]/ul/li[2]/a/span")
	public static WebElement ticketsearch;
	
	@FindBy(xpath=".//*[@id='m_c_pnl1']/table/tbody/tr[3]/td[2]/table/tbody/tr/td/img[1]")
	public static WebElement ticketnumpicker;
	
	@FindBy(id="m_c_pi_ts")
	public static WebElement ticketnumtxtbox;
	
	
	@FindBy(id="m_c_pi_ibg")
	public static WebElement ticketnumtxtboxarrow;
	
	@FindBy(id="iv_0")
	public static WebElement searchedcase;
	@FindBy(id="m_c_pi_csa")
	public static WebElement checkbox;

	@FindBy(id="m_c_btnFetch")
	public static WebElement fetchcase;
	
	@FindBy(id="m_c_btnv")
	public static WebElement action;
	
	/*****************************************
	 * 
	 * Written date : 24 april
	 * Written By : Kajali
	 * 
	 *************************************/
	
	@FindBy(xpath="//*[@id='row0jqxgrid']/div[3]/div/a")
	public static WebElement case1;

	@FindBy(id="m_c_pi_csa")
	public static WebElement showall;

	@FindBy(xpath=".//*[@id='pt']/tbody/tr[1]/td")
	public static WebElement datanot;
	
	@FindBy(id="ui-id-12")
	public static WebElement confirm;
	
	
	//*****************************************
	
	@FindBy(id="m_c_vf_10005762_txt")
	public static WebElement ticketnumber;
	
	@FindBy(xpath=".//*[@id='js-vnav']/li[5]/a/i")
	public static WebElement service;
	
	@FindBy(xpath=".//*[@id='js-vnav']/li[5]/div/ul/li/a/span[2]")
	public static WebElement clickoncase;
	
	@FindBy(xpath=".//*[@id='BTN_EDIT']/i")
	public static WebElement btn_edit;
	
	
	
}
