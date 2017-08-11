package grv1;

import java.sql.SQLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import methods.CSE_Screen_Flow;
import methods.Policy_360;
import methods.Policy_Search;
import mli.appmethods.com.CSEMethods;
import mli.appmethods.com.PoscfMethods;

public class GRV1_TS004_Methods extends PoscfMethods
{
	String caseId=null;
	String assignedTo1=null;
	base.TestConnectivity con = new base.TestConnectivity();
	@Test (enabled=false)
	public void CSEFlow() throws InterruptedException 
	{
		con.setup();
		EnterUserName("cse");
		EnterPassword("acid_qa");
		Login();
		Policy_Search ps= new Policy_Search(driver);
		ps.quick_link();
		ps.policy_search();
		ps.policy_number_text("000003632");  
		ps.fetch();
		ps.check_mark();
		ps.validate();
		ps.popup_handling();
	    Policy_360 ps1= new Policy_360(driver);
	    String return_flag= ps1.return_flag();
	    System.out.println(return_flag);
	    if(return_flag.equalsIgnoreCase("Yes"))
	     {
	 	   ps1.return_to_policy();
	     }
	    String cust = ps1.cust_class();
	    System.out.println(cust);
	    String Agent_status = ps1.agent_status();
		System.out.println(Agent_status);
		ps1.csrequest();
		CSE_Screen_Flow cse= new CSE_Screen_Flow(driver);
		cse.window_handling(driver);
		Thread.sleep(2000);

		EnterCallerType("Customer");
		EnterCallerName("kajali");
		ProblemBox("cse problem box");
		SSC("Premium Posting Error / Ptd Not Moved");
		Next();
		try
	    {
		  Boolean el = driver.findElement(By.xpath("//a[contains(@class,'button-icon-text saveproceedbtn')]/span")).isEnabled();
		  System.out.println(el);
		}
		catch(Exception e)
		 {
		   driver.switchTo().alert().accept();
		 }

		SaveAndProceed();
		Thread.sleep(800);
		caseId= CaseId();
		System.out.println(caseId);
		assignedTo1=assignedTo();
		System.out.println(assignedTo1);
	}
	
	public void ticketsearch() throws InterruptedException
	{
		   quicklink();
		   ticketsearchicon();
		   ticketnumpicker();
		   tctSearchWindowHandling();
		   ticketnumtxt(caseId);
		   showall();
		   searchedcase();
		   fetchcase();
		   action();
	}
	
	public void ScrutinyFlow() throws InterruptedException, SQLException
	{
	   Logout();
	   String abc= con.querry("select loginid from az_user where UserID=(select CurrentOwnerID from cases where caseid="+caseId+")");
	   System.out.println("assignee by db : "+abc);
	   EnterUserName(abc); 
	   EnterPassword("acid_qa");
	   Login();
		try
		{
		String role=CSEMethods.Role();
		System.out.println(role);
		if(role.contains("Claims"))
		{
			CSEMethods.switchRole("Scrutiny");
		}
		}
		catch(Exception e)
		{
			System.out.println("single role");
		}

	   ticketsearch();
	   edit();
	   ScrutinySection();
	   EnterCD("Payment of premium not acted upon or wrongly acted upon");  //or : Policy conversion option not effected ,  Reinstatement denied
	   submenu("premium lying unallocated"); // or Premium incorrectly allocated
	   RCAComment("commnts by scrutiny...."); 
	   IRDAComment("scrutiny IRDA comments..");
	   SaveAndProceed();
	   for(int i=0;i<3;i++)
	   {
		   try
		   {
			   assignedTo1=assignedTo();  
			   break;
		   }
		   catch(Exception e)
		   {
			   System.out.println("entered catch");
		   }
		   
	   }
	   System.out.println("Assignee is "+" "+assignedTo1);
	   while(assignedTo1.equalsIgnoreCase(abc))
	   {
		 refresh();
		 Thread.sleep(3000);
		 assignedTo1=assignedTo();
	   }
	   System.out.println(assignedTo1);
	}
	
	public void GrvFlow() throws InterruptedException, SQLException
	{
		Logout();
		String abc= con.querry("select loginid from az_user where UserID=(select CurrentOwnerID from cases where caseid="+caseId+")");
		System.out.println("assignee by db : "+abc);
		EnterUserName(abc); 
		EnterPassword("acid_qa");
		Login();
		try
		{
		 String role=CSEMethods.Role();
		 System.out.println(role);
		 if(role!=("Grievance Executive"))
		 {
			CSEMethods.switchRole("Grievance Executive");
		 }
		 }
		catch(Exception e)
		 {
		  System.out.println("single role");
		 }
		ticketsearch();
		edit();
		ownerSection();
		resolution_ud();
		resolution_by();
		is_forwarding();
		acceptance_status();
		resolution_comment("resolution comment by grv");
		IRDAComments("GRV IRDA comments...");
		SaveAndProceed();
	}
	
	public void posFlow() throws InterruptedException, SQLException
	{
		Logout();
		String abc= con.querry("select loginid from az_user where UserID=(select CurrentOwnerID from cases where caseid="+caseId+")");
		System.out.println("assignee by db : "+abc);
		EnterUserName(abc); 
		EnterPassword("acid_qa");
		Login();
		ticketsearch();
		edit();
		Forwardee_section();
		Forwardee1_comment("comment by poscf");
		Forwardee1_decision_picker();
		decision_search_box("accept");
		SaveAndProceed();
		assignedTo1=assignedTo();
		System.out.println(assignedTo1);
	}
	
	
	/* Written By : Kajali Agrawal
	 * Written On : 25 Apr'17
	  */

}
