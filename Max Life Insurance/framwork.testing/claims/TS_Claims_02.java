package claims;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

import mli.appmethods.com.CSEMethods;
import mli.appmethods.com.ClaimMethods;
import mli.appmethods.com.GrvMethods;

public class TS_Claims_02 extends ClaimMethods
{
	@Test
	public void abc() throws InterruptedException 
	{
	QuickSearchModule qs = new QuickSearchModule();
	
	qs.QuickSearch();
	
	clickClaimLink();
	enterCallerName("Test");
	enterClaimantName("Test");
	enterContactNumber("9856314789");
//	click_SSCSearch();
	enterSSCNameforSearch("Claim Status Inquiry");
//	selectSearch();
	clickSSCNextbtn();
//	IfFCRNo();

	CSEMethods cs = new CSEMethods();
	cs.ProblemBox("TEST");
	
	GrvMethods grv = new GrvMethods();
//	grv.resolution_comment("resolved");
	grv.SaveAndProceed();
	
	String status=GetStatus();
	String substatus=GetSubStatus();
	assertEquals(substatus, "New");
	assertEquals(status, "New");
    String CaseId=GetCaseId();
    assertNotEquals(CaseId, null,"Msg");
	
	}
}
