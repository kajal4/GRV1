package mli.appmethods.com;

import mli.common.com.InitBrowser;
import mli.pom.com.LoginObjects;

public abstract class LoginMethod extends InitBrowser
{
 public void EnterUserName(String username)
 {
	 LoginObjects.txt_userName.sendKeys(username);
 }
 
 public void EnterPassword(String Password)
 {
	 LoginObjects.txt_password.sendKeys(Password);
 }
 public void Login()
 {
	 LoginObjects.btn_loginButton.click();
 }
 
 public void Logout()
 {
	 LoginObjects.btn_logoutButton.click();
 }
 
}

/* Written By : Kajali Agrawal
 * Written On : 21 Apr'17
 * 
 * 
 * 
 */