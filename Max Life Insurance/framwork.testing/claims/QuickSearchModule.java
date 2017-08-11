package claims;

import org.testng.annotations.Test;

//import mli.appmethods.com.ClaimMethods;
import mli.appmethods.com.ContractSearchMethods;

public class QuickSearchModule extends ContractSearchMethods{
  @Test
  public void QuickSearch() throws InterruptedException {
	
	 EnterUserName("cse");
	 EnterPassword("acid_qa");
	 Login();
	 Quicklink();
//	 PolicyNumberTxt("97969594");	//Check for this policy ID
	 PolicyNumberTxt("000006494");
	 ValidatePolicyNumber();
	 CheckboxTick();
	 Validate();
	 ValidateYes();
	 clickJourneyButton();
	 
////////////////////////////////
	 driver.switchTo();
	 switchWindows();
	 
	 
	 
	
  }
  
  @Test(dependsOnMethods="QuickSearch")
  
  public void claimProcess() throws InterruptedException{
	 
	  ClaimModule cm = new ClaimModule();
	  
	  cm.NaviagtetoClaim();
	  
//	  clickClaimLink();
//		 
//		 ClaimMethods.enterCallerName("Test");
//		 ClaimMethods.enterClaimantName("Test");
//		 ClaimMethods.enterContactNumber("9856314789");
//		 ClaimMethods.click_SSCSearch();
//		 ClaimMethods.enterSSCNameforSearch("claim");
//		 ClaimMethods.selectssc();
//		 ClaimMethods.clickSSCNextbtn();
  }
  
  
}
