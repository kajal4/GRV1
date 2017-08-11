package grv1;

import org.testng.annotations.Test;

import mli.appmethods.com.ContractSearchMethods;

public class NewTest extends ContractSearchMethods{
  @Test
  public void f() throws InterruptedException {
	  
	  EnterUserName("cse");
	  EnterPassword("acid_qa");
	  Login();
	  navigateToContractSerach();
	  PolicyNumberTxt("100129642");
	  ValidatePolicyNumber();
	  System.out.println("c1");
	  Thread.sleep(2000);
	  CheckboxTick();
	  System.out.println("c2");
	 
	  
	  
  }
}
