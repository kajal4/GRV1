package mli.appmethods.com;

import org.openqa.selenium.support.ui.Select;

import mli.pom.com.CSPage;
import mli.pom.com.GrvObjects;

public class GrvMethods extends TicketSearchMethods
{
 public void ownerSection()
 {
	 GrvObjects.case_owner_section.click();
 }
 
 public void nongrvSection()
 {
	 GrvObjects.non_grv_section.click();
 }
 
 public void resolution_ud()
 {
   Select select= new Select(GrvObjects.resolution_ud);
   select.selectByValue("6a");
 }
 
 public void resolution_by()
 {
   Select select= new Select(GrvObjects.resolution_by);
   select.selectByValue("Email");
 }
 
 
 
 public void is_forwarding()
 {
   Select select= new Select(GrvObjects.is_forwarding);
   select.selectByValue("No");
 }
 
 public void acceptance_status()
 {
   Select select= new Select(GrvObjects.acceptance_status);
   select.selectByValue("1");
 }
 
 public void resolution_comment(String ar)
 {   
	 driver.switchTo().frame(1);
	 GrvObjects.resolution_box.sendKeys(ar);
	 driver.switchTo().defaultContent();
 }
 public void IRDAComments (String ar)
 {
	 GrvObjects.IRDASection.sendKeys(ar);
 }
 
 public void tct_status() throws InterruptedException
 {
	try
	{
	if(CSPage.continue1.isDisplayed())
	{
		driver.switchTo().activeElement();
		CSPage.continue1.click();
	}
	}
	catch(Exception e)
	{
		System.out.println("pop-up not available");
	}
	String status= GrvObjects.tct_status.getText();
	System.out.println(status);
 }

}
