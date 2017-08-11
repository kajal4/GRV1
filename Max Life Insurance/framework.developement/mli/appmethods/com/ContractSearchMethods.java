package mli.appmethods.com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import mli.pom.com.ClaimPage;
import mli.pom.com.Contract_Search_Objects;

public  class ContractSearchMethods extends LoginMethod {
	public void ContractObject() {
		Contract_Search_Objects.icon_sales.click();
		Contract_Search_Objects.icon_contracts.click();
	}

	public void Quicklink() {
		Contract_Search_Objects.QuickLink_icon.click();
		Contract_Search_Objects.PolicySearch_icon.click();

	}
	
	public static void ValidateYes(){
		Contract_Search_Objects.btn_ValidateYes.click();
	}
	

	public void PolicyNumberTxt(String Policyno) {

		Contract_Search_Objects.txt_PolicyNumber.sendKeys(Policyno);
	}

	public void ValidatePolicyNumber() {
		Contract_Search_Objects.btn_FetchData.click();
	}

	public void CheckboxTick() throws InterruptedException{
		int i = 0;		
		if (Contract_Search_Objects.Checkbox1_Policy_ID.getText().length() > 0) {
			if(i<= 2){
			Contract_Search_Objects.CheckBox1.click();/// Policy ID Check box
			System.out.println("...Check box ticked"+i);
			i = i + 1;
		}
		}
				
		if (Contract_Search_Objects.Checkbox2_First_Name.getText().length() > 0) {
			if(i<=2){
			Contract_Search_Objects.CheckBox2.click();/// First Name Check box		
			System.out.println("...Check box ticked"+i);
			i = i + 1; 
		}
		}
		
		if (Contract_Search_Objects.Checkbox3_Client_ID.getText().length() > 0) {
			if(i<=2){
			Contract_Search_Objects.CheckBox3.click();/// Client ID Check Box
			System.out.println("...Check box ticked"+i);
			i = i + 1;
		}
		}
		
		if (Contract_Search_Objects.Checkbox4_Last_Name.getText().length() > 0) {
			if(i<= 2){
			Contract_Search_Objects.CheckBox4.click();/// Last Name Check box
			System.out.println("...Check box ticked"+i);
			i = i + 1;
		}
		}
		
		if (Contract_Search_Objects.Checkbox5_DOB.getText().length() > 0) {
			if(i<= 2){
			Contract_Search_Objects.CheckBox5.click();/// DOB Check box
			System.out.println("...Check box ticked"+i);
			i = i + 1;
		}
		}
		
		if (Contract_Search_Objects.Checkbox6_PIN_Code.getText().length() > 0) {
			if(i<= 2){
			Contract_Search_Objects.CheckBox6.click();/// Pin Code Check box
			i = i + 1;
		}
		}
		
	}

	public void Validate() {
		Contract_Search_Objects.btn_Validate.click();
		
	}
	
	

	public void navigateToContractSerach() {
		driver.navigate().to("http://maxunosa/sn/app/layouts/validationform.aspx?x=82jp6vdgr297vagdqgckh9aul2");
	}

	/*
	 * Written on : 20 April'17 Written By : Manish
	 * 
	 * 
	 * 
	 */
	
	public static void clickJourneyButton() throws InterruptedException{
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
	
	public void switchWindows() throws InterruptedException{
		
		Thread.sleep(2000);
		
		Set<String> handles =  driver.getWindowHandles();
		Iterator<String> I = handles.iterator();
		String main_window =  I.next();
		System.out.println(main_window);
		String Child_window = I.next();
		
		driver.switchTo().window(Child_window).getWindowHandle();
	}
	
	public void clickClaimLink(){
		

		ClaimPage.link_Claim.click();
	}

}
