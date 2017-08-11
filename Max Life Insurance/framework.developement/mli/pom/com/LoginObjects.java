package mli.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObjects 
{
	public LoginObjects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
 @FindBy(id="TxtName")
 public static WebElement txt_userName ;
  
 @FindBy(id="TxtPassword")
 public static WebElement txt_password ;
 
 @FindBy(xpath=".//*[@id='registration']/ul/li[5]/input")
 public static WebElement btn_loginButton ;
 
 @FindBy(xpath="//a[contains(@title,'Logout')]")
 public static WebElement btn_logoutButton ;
 
}

/* Written By : Kajali Agrawal
 * Written On : 21 Apr'17
 * 
 * 
 * 
 */
