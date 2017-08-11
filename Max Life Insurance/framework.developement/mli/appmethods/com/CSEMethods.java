package mli.appmethods.com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import mli.pom.com.CSPage;

public  class CSEMethods extends LoginMethod
{
  public void BeginJourney()
  {
	  CSPage.Btn_Journey.click();
  }
	
  public void EnterCallerType(String callertype)
  {
	  JavascriptExecutor jse= (JavascriptExecutor)driver;
	  jse.executeScript("arguments[0].scrollIntoView(true)", CSPage.DropDown_Caller_type);
	  Select select = new Select(CSPage.DropDown_Caller_type);
	  select.selectByVisibleText(callertype);
  }
  
  public void EnterCallerName(String name)
  {
	  CSPage.Txt_Callername.sendKeys(name);
  }
  
  public void ProblemBox(String comment) throws InterruptedException
  {   
	  Thread.sleep(1000);
	  driver.switchTo().frame(0);
	  CSPage.Txt_ProblemBox.sendKeys(comment);
	  driver.switchTo().defaultContent();
  }
  
  public void SSC(String ssc) throws InterruptedException
  {
	  CSPage.Txt_SSC.sendKeys(ssc);
	  WebDriverWait wait= new WebDriverWait(driver, 60);
	  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ui-id-12"))));
	  CSPage.Txt_SSC.sendKeys(Keys.DOWN,Keys.ENTER);
  }
  
  public void Next()
  {
	  CSPage.Btn_Next.click();
  }
  
  public void ClickOnPolicy()
  {
     CSPage.Policy1.click();
  }
  
  public void SwitchToChildWindow() throws InterruptedException
  {
	  Thread.sleep(1500);
	  Set<String> handles= driver.getWindowHandles();
	  Iterator<String> I= handles.iterator();
	  String MainWindow = I.next();
	  System.out.println(MainWindow);
	  String ChildWindow = I.next();
	  System.out.println(ChildWindow);
	  driver.switchTo().window(ChildWindow);
	  WebDriverWait wait= new WebDriverWait(driver, 60);
	  wait.until(ExpectedConditions.visibilityOf(CSPage.CSERequest));
	  CSPage.CSERequest.click();
	  
  }
  
  public void SaveAndProceed()
  {
	  CSPage.Btn_SaveandProceed.click();
  }
  
  
/* Written By : Kajali Agrawal
 * Written On : 21 Apr'17
 */
  
  public String CaseId()
  {
	  String caseId=CSPage.case_no.getText();
	  caseId=caseId.replaceFirst("0000","");
	  return(caseId);
  }
  
  
  public String assignedTo()
  {   
	  
	  String assignedTo= CSPage.assignedTo.getText();
	  return(assignedTo);
  } 
  
  
  public void alertHandling()
  {
	  Boolean el = CSPage.Btn_SaveandProceed.isEnabled();
	  System.out.println(el);
	  System.out.println("here we are............");
		if(el==false)
		{
			driver.switchTo().alert().accept();
			
		}
  }
  
  public void returnflag()
  {
	  
	  String flag=CSPage.return_mail_flag.getText();
	  if(flag.equalsIgnoreCase("Yes"))
	  {
	  driver.switchTo().activeElement();
	  CSPage.popupclose.click();
	  }
  }
  
  public static String Role()
	{
		return(driver.findElement(By.id("cmbrole")).getText());
	}
  
  public static void switchRole(String ar)
  {
	  Select select= new Select(driver.findElement(By.id("cmbrole")));
	  select.selectByVisibleText(ar);
  }
  
}