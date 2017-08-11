package claims;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import mli.appmethods.com.CSEMethods;
import mli.appmethods.com.ClaimMethods;
import mli.appmethods.com.GrvMethods;
//import mli.appmethods.com.LoginMethod;
import mli.appmethods.com.TicketSearchMethods;
import mli.pom.com.ClaimPage;
public class Claims_NFCR extends ClaimMethods {
		String caseOwner;
		String CaseId;
		String AssignedTo;
		String substatus;
		CSEMethods cs = new CSEMethods();
		GrvMethods grv = new GrvMethods();
		
		@Test
		public void NaviagtetoClaim() throws InterruptedException {
						
			QuickSearchModule qs = new QuickSearchModule();
			
			qs.QuickSearch();
			
			clickClaimLink();
			
			String SSC="Claim Status Inquiry";

			enterCallerName("Test");
			enterClaimantName("Test");
			enterContactNumber("9856314789");
			enterSSCNameforSearch(SSC);
//			selectSearch();
			claimantEmail();
			clickSSCNextbtn();
			cs.ProblemBox("TEST");
			
			String a="Claim Status Inquiry";
			String b="Claim Forms required";
			String c="Claim process clarification";
			
			if(SSC.equalsIgnoreCase(a)||SSC.equalsIgnoreCase(b)||SSC.equalsIgnoreCase(c)){
				String action ="NO";	//FCR-NonFCR Selection Area
			
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
				}
				else{
					grv.SaveAndProceed();		
					String status=GetStatus();
					substatus=GetSubStatus();
					assertEquals(substatus, "New");
					assertEquals(status, "New");
				    CaseId=GetCaseId();
				    assertNotEquals(CaseId, null,"Msg");
				    caseOwner=ClaimPage.getcaseOwner.getText();
//				   System.err.println("Case owner is"+" "+caseOwner);
				    
				  // driver.close();
			
				}
			}
			else{
				grv.SaveAndProceed();		
				String status=GetStatus();
				substatus=GetSubStatus();
				assertEquals(substatus, "New");
				assertEquals(status, "New");
			    CaseId=GetCaseId();
			    assertNotEquals(CaseId, null,"Msg");
			    caseOwner=ClaimPage.getcaseOwner.getText();
//			   System.err.println("-10. Case owner is"+" "+caseOwner);
//			   System.out.println("+10. Sub Status ="+substatus);
//				
			}
			
			
		}
				
		@Test
		public void backendlogin() throws InterruptedException{
			
			//caseOwner=ClaimPage.getcaseOwner.getText();
			ClaimMethods cm= new ClaimMethods();
			//AssignedTo=ClaimPage.getcaseOwner.getText();
			AssignedTo=cm.LoginID(caseOwner, substatus);
			EnterUserName(AssignedTo);
			EnterPassword("acid_qa");
			Login();

			Thread.sleep(2000);
			claimBackendRole();
			
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
	        
//			assertEquals(actual, "Resolved");
			
			
			
		}
}
