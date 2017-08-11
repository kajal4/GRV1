package mli.appmethods.com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import mli.pom.com.TicketSearchObjects;

public  class TicketSearchMethods extends ScrutinyMethods
{
  public void quicklink() throws InterruptedException
  {
	  Thread.sleep(2000);
	  TicketSearchObjects.quicklink.click();
  }
  
  public void ticketsearchicon()
  {
	  TicketSearchObjects.ticketsearch.click();
  }
  
  public void ticketnumpicker()
  {
	  TicketSearchObjects.ticketnumpicker.click();
  }
  
  String Basewindow=null;
  String Childwindow=null;
  String SearchWindow=null;
  public void tctSearchWindowHandling() throws InterruptedException
  {
	  Thread.sleep(2000);
		Set<String> window = driver.getWindowHandles();
		Iterator<String> I1 = window.iterator();
		Basewindow = I1.next();
		System.out.println(Basewindow);
		Childwindow = I1.next();
		System.out.println(Childwindow);
		SearchWindow= I1.next();
		System.out.println(SearchWindow);
		driver.switchTo().window(SearchWindow);
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(TicketSearchObjects.ticketnumtxtbox));

  }
  public void ticketnumtxt(String ar)
  {
	  TicketSearchObjects.ticketnumtxtbox.sendKeys(ar);
	  TicketSearchObjects.ticketnumtxtboxarrow.click();
  }
  
  public void searchedcase() throws InterruptedException
  {
	 try{
	  TicketSearchObjects.searchedcase.click();  
	  
	 }
	 catch(Exception e)
	 {
		 TicketSearchObjects.checkbox.click();   
		 Thread.sleep(1000);
		 TicketSearchObjects.searchedcase.click();  
	 }
  }	
  
  public void fetchcase()
  {
	  if(Childwindow != null){
	  System.out.println(Childwindow);
	  driver.switchTo().window(Childwindow);
	  TicketSearchObjects.fetchcase.click();
	  }else
	  TicketSearchObjects.fetchcase.click();  
  }	
  
  
  public void action()
  {
	  TicketSearchObjects.action.click();  
  }	
  
  /*****************************************
	 * 
	 * Written date : 24 april
	 * Written By : Kajali
	 * 
	 *************************************/
  
  public void case1()
  {
	  TicketSearchObjects.case1.click();
  }
  
  public void showall()
  {
	  String ar= TicketSearchObjects.datanot.getText();
	  System.out.println(ar);
	  if(ar.equalsIgnoreCase("Data does not exist"))
	  {
	  TicketSearchObjects.showall.click();
	  }
  }
    
  
//  ***********************************************
  
  public void enterticketno(String ar){
	  TicketSearchObjects.ticketnumber.sendKeys(ar);
  }
  
  public void serviceObject(){
	  TicketSearchObjects.service.click();
  }
  
  public void caseitem(){
	  TicketSearchObjects.clickoncase.click();
  }
  
  public void case_edit(){
	  TicketSearchObjects.btn_edit.click();
  }
  
  
}
