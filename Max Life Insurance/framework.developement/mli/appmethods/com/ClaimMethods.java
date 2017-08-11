package mli.appmethods.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;



//import java.util.concurrent.TimeUnit;

import mli.pom.com.ClaimPage;

public class ClaimMethods extends LoginMethod {

	public static void clickSSCNextbtn() {
		ClaimPage.btn_SSCNext.click();
	}

//	public static void selectSearch() throws InterruptedException {
//
//		ClaimPage.sscSearch.click();
//		Thread.sleep(1000);
//		ClaimPage.drpdwn_SelectSSC.click();
//	}

	public static void enterCallerName(String name) {
		ClaimPage.EnterCallerName.sendKeys(name);
	}

	public static void enterClaimantName(String cn) {
		ClaimPage.EnterClaimantName.sendKeys(cn);
	}
	
	public static void claimantEmail(){
		ClaimPage.email.sendKeys("manish.k.ghai@crmnext.in");
	}

	public static void clickClaimLink() {

		ClaimPage.link_Claim.click();
	}

//	public static void click_SSCSearch() {
//
//		ClaimPage.link_ClickSearchSSC.click();	
//	}
	
	public static void enterSSCNameforSearch(String sscName) throws InterruptedException{
		ClaimPage.link_ClickSearchSSC.click();
		Thread.sleep(1000);
		ClaimPage.enterText.sendKeys(sscName);
		ClaimPage.sscSearch.click();
		Thread.sleep(1000);
		ClaimPage.drpdwn_SelectSSC.click();
	}
	
	public static void enterContactNumber(String number){
		
		ClaimPage.EnterContactNumber.sendKeys(number);
	}
	
	public static void IfFCRYes(String action){
		Select s = new Select(ClaimPage.IsFCR);
		s.selectByVisibleText(action);	
		
	}
//	
//	public static void IfFCRNo(){
//		Select s = new Select(ClaimPage.IsFCR);
//		s.selectByVisibleText("No");
//	}
	
	public static void ProblemBox(){
		ClaimPage.ProblemBox.sendKeys("Hello");
	}
	
	
	public void clickJourneyButton() throws InterruptedException{
		if(driver.findElements(By.xpath(".//*[@id='ui-id-16']")).size()>0) ///Just to close the Pop-up at the time of Policy360 
		{
			
			driver.findElement(By.xpath("html/body/div[3]/div[1]/a/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='divmaterialButton']/a/i")).click();
			driver.findElement(By.xpath(".//*[@id='BTN_SCREENFLOW_0']/i")).click();
		}
		else
		{
			driver.findElement(By.xpath(".//*[@id='divmaterialButton']/a/i")).click();
			driver.findElement(By.xpath(".//*[@id='BTN_SCREENFLOW_0']/i")).click();
		}
	}

	public String GetStatus()
	{
		String status= ClaimPage.Status.getText();
		return status;
	}
	
	public String GetSubStatus()
	{
		String substatus= ClaimPage.SubStatus.getText();
		return substatus;
	}
	
	public String GetCaseId()
	{
		String CaseId=ClaimPage.CaseId.getText();
		return CaseId;
	}
	
	public void claimresolutionby()
	 {
	   Select select= new Select(ClaimPage.claimresolutionby);
	   select.selectByValue("Email");
	 }
	
	public String StatusBknd()
	{
		String statusbknd= ClaimPage.statusbknd.getText();
		return statusbknd;
	}
	
	public String SubStatusBknd()
	{
		String substatusbknd= ClaimPage.substatusbknd.getText();
		return substatusbknd;
	}
	
	public static void enterComplaintType(String ct) throws InterruptedException{
		Thread.sleep(2000);
		ClaimPage.enterText.sendKeys(ct);
	}
	
	public String LoginID(String owner, String sstatus) //Check for User Logins
	{
		String LoginID = null;
		if(sstatus.equalsIgnoreCase("New")){
			String[][] C_bcknd = new String[][]
					{ // "Assigned to","LoginID" 
						{"cag3", "cag3"},
						{"Claim_Backend", "claimbackend"}
					};
				for (int i=0;i<2;i++){
					if(C_bcknd[i][0].equalsIgnoreCase(owner)){
						LoginID=C_bcknd[i][1];
						break;
					}				
				}
		}
		else if(sstatus.equalsIgnoreCase("Assigned To Scrutiny")){
			String[][] scrutiny = new String[][]
					{ // "Assigned to","LoginID" 
						{"Scrutiny1", "Scrutiny1"},
						{"Scrutiny2", "Scrutiny2"},
						{"Scrutiny3", "Scrutiny3"}
					};		
			for (int i=0;i<=2;i++){				
				if(scrutiny[i][0].equalsIgnoreCase(owner)){
					LoginID=scrutiny[i][1];
					break;
				}				
			}
		}
		else if(sstatus.equalsIgnoreCase("Assigned To Backend")){
			String[][] C_bcknd = new String[][]
					{ // "Assigned to","LoginID" 
						{"cag3", "cag3"},
						{"Claim_Backend", "claimbackend"}
					};		
				for (int i=0;i<=2;i++){				
					if(C_bcknd[i][0].equalsIgnoreCase(owner)){
						LoginID=C_bcknd[i][1];
						break;
					}				
				}
		}
		else if(sstatus.equalsIgnoreCase("Assigned To Grv")){
			String[][] C_Grv = new String[][]
					{ //"Assigned to","LoginID" 
						{"cag3", "cag3"},
						{"grv1", "grv1"},
						{"grv2", "grv2"}
					};		
				for (int i=0;i<=2;i++){				
					if(C_Grv[i][0].equalsIgnoreCase(owner)){
						LoginID=C_Grv[i][1];
						break;
					}				
				}
		}
		else
			System.out.println("Invalid Ticket Assignments");
		
		return LoginID;
	}	
	
	public static void claimBackendRole() throws InterruptedException{
		String a = ClaimPage.claimBckndRole.getText();
		String b = "Claims - Backend Executive";
		System.out.println("000 Role==="+a);
		if(a!=b){
			try{
			Select s = new Select(ClaimPage.selectRole);
			s.selectByVisibleText("Claims - Backend Executive");
			}
			catch(Exception e)
			{
				System.out.println("Single role");
			}
		}
	}
	
	public static void claimScrutinyRole() throws InterruptedException{
		String a = ClaimPage.selectRole.getText();
		String b = "Claims - Scrutiny Executive";
		if(a!=b){
			try{
			Select s = new Select(ClaimPage.selectRole);
			s.selectByVisibleText("Claims - Scrutiny Executive");
		}
			catch(Exception e){
				System.out.println("Single Role");
			}
		}
			
	}
	
	public static void claimGrvRole() throws InterruptedException{
		String a = ClaimPage.selectRole.getText();
		String b = "Claims - Grievance Executive";
		if(a!=b){
			try{
			Select s = new Select(ClaimPage.selectRole);
			s.selectByVisibleText("Claims - Grievance Executive");
		}
			catch(Exception e){
				System.out.println("Single Role");
			}
		}
			
	}
		
	public static void clickScrutinyTab(){
		ClaimPage.clickscrutinytab.click();
	}
	
//	public static void selectCD(){
//		ClaimPage.selectCD.click();
//	}
	
	public static void enterCD(String CD) throws InterruptedException{
		ClaimPage.selectCD.click();
		Thread.sleep(1000);
		ClaimPage.enterText.sendKeys(CD);
		Thread.sleep(1000);
		ClaimPage.drpdwn_SelectSSC.click();
	}
	
	public static void selectCT(String ct) throws InterruptedException{
		Select s = new Select(ClaimPage.selectCT);
		s.selectByVisibleText(ct);
	}
	
	public static void complaintAgainstType() throws InterruptedException{
		Select s = new Select(ClaimPage.cAgainstType);
		s.selectByVisibleText("Insurer");
	}
	
	public static void RCAType(){
		Select s = new Select(ClaimPage.rcaType);
		s.selectByVisibleText("Repudiation - Rider claims");
	}
	public void IRDAProblemBox(String ar){
		ClaimPage.irdaProblem.sendKeys(ar);
	}
	
	public String claimGrvID(String owner) //Check for Claims Grv user
	{
		System.out.println("1.Owner"+" "+owner);
		String C_GrvID = null;
		
		String claimgrv[][]= new String[][]
		{//"Assigned to","LoginID"
			{"grv1", "grv1"},
			{"grv2", "grv2"},
			{"grv3", "grv3"}
		};				
		for (int i=0;i<=2;i++){				
			if(claimgrv[0][i].equalsIgnoreCase(owner)){
				C_GrvID=claimgrv[1][i];
				break;
			}				
		}
		return C_GrvID;
	}
	
	public static void refreshpage(){
		ClaimPage.refreshpage.sendKeys(Keys.F5);
	}
	
	public static void refresh1(){
		driver.navigate().refresh();
	}
	
	public static void clickGrvTab(){
		ClaimPage.claimGrievanceTab.click();
	}
	
	public static void enterClaimHistory(){//  field===Claims History
		ClaimPage.f_History.sendKeys("....Claim History....");
	}
	
	public static void enterReasonReputation(){//  field===Reason for Repudiation
		Select s = new Select(ClaimPage.f_ReasonReputataion);
		s.selectByVisibleText("Repudiation for Fraud - Others");
	}
	
	public static void enterRepuSummary(){// field===Reason for Repudiation Summary
		ClaimPage.f_RepuSummary.sendKeys("....Claim Reason for Repudiation Summary....");
	}
	
	public static void enterFactCase(){// field===Facts of the Case
		ClaimPage.f_FactsCase.sendKeys("....Enter Facts of Case...");
	}
	
	public static void enterStrongPoint(String a) throws InterruptedException{// field===Strong Points
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)", ClaimPage.f_StrongPoint);
		ClaimPage.f_StrongPoint.click();
		Thread.sleep(1000);
		ClaimPage.enterText.sendKeys(a);
		ClaimPage.selectsearch.click();
		Thread.sleep(1000);
		ClaimPage.selectvalue.click();
		ClaimPage.btn_Select.click();
		
	}
	
	public static void enterStrongSummary(){
		ClaimPage.f_StrongSummary.sendKeys("Strong Point Summary");
	}
	
	public static void enterWeakPoint(String a) throws InterruptedException{ // field==Weak Points
		ClaimPage.f_WeakPoint.click();
		Thread.sleep(1000);
		ClaimPage.enterText.sendKeys(a);
		ClaimPage.selectsearch.click();
		Thread.sleep(1000);
		ClaimPage.selectvalue.click();
		ClaimPage.btn_Select.click();
		
	}
	
	public static void enterWeakSummary(){
		ClaimPage.f_WeakSummary.sendKeys("Weak Point Summary");
	}
	
	public static void enterRecommendationSummary(){
		ClaimPage.f_RecommendationSummary.sendKeys("Recommendation Summary");
		
	}
		
	public static void enterRecommendation(){
		Select s= new Select(ClaimPage.f_Recommendation);
		s.selectByVisibleText("Comply");
	}
	
	public static void clickResolutionTab(){
		ClaimPage.ClaimResolutionTab.click();
	}
	
	public static void enterResolutionBy(){
		Select s = new Select(ClaimPage.f_ResolutionBy);
		s.selectByVisibleText("Email");
	}
	
	public static void enterIrdaResolution(){
		ClaimPage.f_IrdaResolution.sendKeys("IRDA Comments");
	}
	
	public static void enterAcceptanceStatus() throws InterruptedException{
		Select s = new Select(ClaimPage.f_AcceptanceStatus);
		s.selectByVisibleText("Partially Accepted");
		Thread.sleep(1500);
	}
	
	public static void enterAmountRecon(){
		ClaimPage.f_AmountReconsideration.sendKeys("20");
	}
	
	public static void enterPaymentDate(){
		ClaimPage.f_PaymentDate.click();
	}
	
	public static void enterPaymentCheque(){
		ClaimPage.f_PaymentChequeNo.sendKeys("123456");
	}
	
	public static void enterChequeDate(){
		ClaimPage.f_PaymentChequeDate.click();		
	}
	
	public static void enterResolutionDate(){
		ClaimPage.f_ResolutionLetterDate.click();
	}
	public static String Role()
	{
		return(driver.findElement(By.id("cmbrole")).getText());
	}
}
	
