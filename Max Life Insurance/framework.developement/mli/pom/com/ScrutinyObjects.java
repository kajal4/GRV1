package mli.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScrutinyObjects extends LoginObjects
{

	public ScrutinyObjects(WebDriver driver)
	{
		super(driver);
	}

@ FindBy(xpath=".//p[contains(@title,'Scrutiny')]")	
 public static WebElement link_ScrutinySection;

@ FindBy(id="Cas_ex1_87")	
public static WebElement txt_CD;

@ FindBy(id="cas_ex6_72")	
public static WebElement txt_RCAComment;

@ FindBy(id="Cas_ex4_32")
public static WebElement IRDA_txt;

@ FindBy(id="XMLField_35278")	
public static WebElement txt_RCAType;

@ FindBy(id="BTN_EDIT")	
public static WebElement btn_edit;

/* Written By : Kajali Agrawal
 * Written On : 21 Apr'17
 * 
 * 
 * 
 */


@ FindBy(id="ResolutionCode")	
public static WebElement txt_submenu;



}