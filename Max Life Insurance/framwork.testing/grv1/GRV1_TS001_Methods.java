package grv1;

import java.sql.SQLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import methods.CSE_Screen_Flow;
import methods.Policy_360;
import methods.Policy_Search;
import mli.appmethods.com.CSEMethods;
import mli.appmethods.com.ContractSearchMethods;
import mli.appmethods.com.GrvMethods;

public class GRV1_TS001_Methods extends GrvMethods {
	ContractSearchMethods cs = new ContractSearchMethods();
	base.TestConnectivity con = new base.TestConnectivity();
	String caseId=null;
	@Test (enabled=false)
	public void Login_Method() throws InterruptedException 
	{
		EnterUserName("cse");
		EnterPassword("acid_qa");
		Login();
	}

	@Test (enabled=false)
	public void ContractSearch(String ar) throws InterruptedException 
	{
		cs.ContractObject();
		cs.Quicklink();
		cs.PolicyNumberTxt(ar);
		cs.ValidatePolicyNumber();
		cs.CheckboxTick();
		cs.Validate();
	}
	
	String assignedTo=null;
	
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
		cse.caller_type("Customer");
		cse.caller_name();	
		ProblemBox("cse problem box");
		SSC("POS Request Delay / Error");
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
//		alertHandling();
		SaveAndProceed();
		Thread.sleep(800);
		caseId= CaseId();
		System.out.println(caseId);
		assignedTo=assignedTo();
		System.out.println(assignedTo);
	}
	
	/* Written By : Kajali Agrawal
	 * Written On : 21 Apr'17
	  */
	
	public void ticketsearch() throws InterruptedException
	{
		   quicklink();
		   ticketsearchicon();
		   ticketnumpicker();
		   tctSearchWindowHandling();
		   ticketnumtxt(caseId);
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
	   EnterCD("Request for Servicing Branch transfer is not");   // OR : Request for Servicing Branch transfer is not effected
	   RCAType("ECS Issue");
	   RCAComment("commnts by scrutiny....");
	   IRDAComment("Scrutiny IRDA Comments");
	   Thread.sleep(1500);
	   SaveAndProceed();
	   for(int i=0;i<3;i++)
	   {
		   try
		   {
			   assignedTo=assignedTo();  
			   break;
		   }
		   catch(Exception e)
		   {
			   System.out.println("entered catch");
		   }
		   
	   }
	   System.out.println("Assignee is "+" "+assignedTo);
	   while(assignedTo.equalsIgnoreCase(abc))
	   {
		 refresh();
		 Thread.sleep(3000);
		 assignedTo=assignedTo();
	   }
	   System.out.println(assignedTo);
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
		IRDAComments("GRV IRDA Comments...");
		SaveAndProceed();
	}
	
	
	/* Written By : Kajali Agrawal
	 * Written On : 24 Apr'17
	  */
}

