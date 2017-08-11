package claims;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

import mli.appmethods.com.CSEMethods;
import mli.appmethods.com.ClaimMethods;
import mli.appmethods.com.GrvMethods;
public class Claims_FCR extends ClaimMethods {
		String caseOwner;
		String CaseId;
		String AssignedTo;
		CSEMethods cs = new CSEMethods();
		GrvMethods grv = new GrvMethods();
		
		@Test
		public void NaviagtetoClaim() throws InterruptedException {
						
			QuickSearchModule qs = new QuickSearchModule();
			
			qs.QuickSearch();
			
			clickClaimLink();

			enterCallerName("Test");
			enterClaimantName("Test");
			enterContactNumber("9856314789");
//			click_SSCSearch();
			enterSSCNameforSearch("Claim Status Inquiry");
//			selectSearch();
			claimantEmail();
			clickSSCNextbtn();
			cs.ProblemBox("TEST");
			
			String action ="Yes";	//FCR-NonFCR Selection Area
			
			IfFCRYes(action);
			
			
			if(action.equalsIgnoreCase("Yes")){
				try{
				
				grv.resolution_comment("resolved");
				grv.SaveAndProceed();
				String status=GetStatus();
				String substatus=GetSubStatus();
				assertEquals(substatus, "Closed");
				assertEquals(status, "Closed");
		        CaseId=GetCaseId();
		        assertNotEquals(CaseId, null,"Msg");
			}
				catch(Exception e){
					System.out.println("Only FCR Ticket will be logged...");
				}
			
			    
			  //  driver.close();
		
			}
			
		}
}
