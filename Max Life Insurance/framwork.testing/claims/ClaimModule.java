package claims;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

import mli.appmethods.com.CSEMethods;
import mli.appmethods.com.ClaimMethods;
import mli.appmethods.com.GrvMethods;
//import mli.appmethods.com.LoginMethod;
import mli.appmethods.com.TicketSearchMethods;
import mli.pom.com.ClaimPage;
public class ClaimModule extends ClaimMethods {
	String caseOwner;
	String CaseId;
	String AssignedTo;
	String substatus;
	CSEMethods cs = new CSEMethods();
	GrvMethods grv = new GrvMethods();
	
	@Test
	public void NaviagtetoClaim() throws InterruptedException {
		
		
	

//		LoginMethod lg= new LoginMethod() ;
		
		QuickSearchModule qs = new QuickSearchModule();
		
		qs.QuickSearch();
		
		clickClaimLink();

		enterCallerName("Test");
		enterClaimantName("Test");
		enterContactNumber("9856314789");
		enterSSCNameforSearch("Correspondence not received");
//		selectSearch();
		claimantEmail();
		clickSSCNextbtn();
		
		cs.ProblemBox("TEST");
		
/*		String action ="No";
		IfFCRYes(action);
		if(action.equalsIgnoreCase("Yes")){
			
			
			grv.resolution_comment("resolved");
			grv.SaveAndProceed();
			
			String status=GetStatus();
			String substatus=GetSubStatus();
			assertEquals(substatus, "Closed");
			assertEquals(status, "Closed");
	        CaseId=GetCaseId();
	        assertNotEquals(CaseId, null,"Msg");
		}else{
					
			grv.SaveAndProceed();
			
			String status=GetStatus();
			String substatus=GetSubStatus();
			assertEquals(substatus, "New");
			assertEquals(status, "New");
		    CaseId=GetCaseId();
		    assertNotEquals(CaseId, null,"Msg");
		    
		   caseOwner=ClaimPage.getcaseOwner.getText();
		   System.err.println("Case owner is"+" "+caseOwner);
		    
		    driver.close();
			
		}
		
*/		
		grv.SaveAndProceed();

	    
	  //For NFCR+Scrutiny Flow
		String status=GetStatus();
		substatus=GetSubStatus();
		assertEquals(substatus, "Assigned to Scrutiny");
		assertEquals(status, "New");
	    CaseId=GetCaseId();
	    assertNotEquals(CaseId, null,"Msg");
	    
	    
	   caseOwner=ClaimPage.getcaseOwner.getText();
	   System.err.println("Case owner is"+" "+caseOwner);
	    
	   //driver.close();

	
	}
	
	/*@Test
	public void backendlogin() throws InterruptedException{
		
		EnterUserName("ARajesh");
		EnterPassword("acid_qa");
		Login();
		
		TicketSearchMethods	ts = new TicketSearchMethods();
		//GrvMethods gm= new GrvMethods();
		ts.serviceObject();
		ts.caseitem();
		ts.quicklink();
		ts.ticketsearchicon();
		ts.enterticketno(CaseId);
		ts.fetchcase();
		ts.action();
		ts.case_edit();
		cs.ProblemBox("Testing");
		grv.resolution_comment("Resolved");
		
		claimresolutionby();
		grv.SaveAndProceed();
		
		String status=StatusBknd();
		String substatus=SubStatusBknd();
		
		Assert.assertEquals(status, "Resolved");
		Assert.assertEquals(substatus, "Resolved");
        
//		assertEquals(actual, "Resolved");
		
	}
	*/
	
	@Test
	public void scrutinylogin() throws InterruptedException{
		
		
	/*	String assignedTo=ClaimPage.assignedTo;
		EnterUserName("claims_scrutiny");//Scrutiny user ID
		ClaimMethods cm= new ClaimMethods();
		AssignedTo=cm.GetAssignedTo();
	*/
		ClaimMethods cm= new ClaimMethods();
		
		//AssignedTo=ClaimPage.getcaseOwner.getText();
		AssignedTo=cm.LoginID(caseOwner, substatus);		
		System.out.println("Assigned to ="+AssignedTo);
		EnterUserName(AssignedTo);
		EnterPassword("acid_qa");
		Login();
		Thread.sleep(2000);
		claimScrutinyRole();
		TicketSearchMethods	ts = new TicketSearchMethods();
		
		Thread.sleep(3000);
		ts.serviceObject();
		ts.caseitem();
		ts.quicklink();
		ts.ticketsearchicon();
		ts.enterticketno(CaseId);
		ts.fetchcase();
		ts.action();
		ts.case_edit();
//		cm.clickScrutinyTab();
//		cm.selectCD();
		clickScrutinyTab();
		selectCT("Death Claims");
		enterCD("Death claim investigation not completed");
//		selectSearch();
		complaintAgainstType();
		RCAType();
		GrvMethods gm= new GrvMethods();
		gm.RCAComment("Comments Entered by scrutiny....");
		IRDAProblemBox("...IRDA Comments Entered By Scrutiny");
		gm.SaveAndProceed();
		
//		String status=GetStatus();
//		String substatus=GetSubStatus();
//		assertEquals(substatus, "Assigned to Grv");//For Grv
//		//assertEquals(substatus, "Assigned to Backend");//For Non-Grv
//		assertEquals(status, "Acknowleged");
//	    CaseId=GetCaseId();
//	    assertNotEquals(CaseId, null,"Msg");
//	    
//	    
//	   caseOwner=ClaimPage.getcaseOwner.getText();
//	   System.err.println("Case owner is"+" "+caseOwner);
	}

}
