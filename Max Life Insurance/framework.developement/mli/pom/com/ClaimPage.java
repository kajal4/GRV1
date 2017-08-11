package mli.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClaimPage extends LoginObjects{

	public ClaimPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
@FindBy(linkText="Claims")
public static WebElement link_Claim;

@FindBy(id="Cas_ex1_38") //Caller Name
public static WebElement EnterCallerName;

@FindBy(id="cas_ex9_60") //Claimant Name
public static WebElement EnterClaimantName;

@FindBy(id="Cas_ex5_38") //Contact Number
public static WebElement EnterContactNumber;

@FindBy(id="cas_ex9_61")
public static WebElement email;

//Select Sub Sub Category

@FindBy(id="SubCategory1imgpick") //Sub Sub Category
public static WebElement link_ClickSearchSSC;

@FindBy(id="TxtSearch") //Enter Sub Sub Category
public static WebElement enterText;

@FindBy(id="iv_0")//Select Sub Sub Category
public static WebElement drpdwn_SelectSSC;

@FindBy(xpath=".//*[@id='imgsearch']/i") //SSC search Button
public static WebElement sscSearch; 

@FindBy(xpath="//i[@class='icon icon-next']") //Click on Next Button
public static WebElement btn_SSCNext;

@FindBy(id="cas_ex10_59")//Is FCR=Yes/No
public static WebElement IsFCR;
 
@FindBy(id="cke_1_contents") //Click on Problem Box
public static WebElement ProblemBox; 

@FindBy(xpath=".//*[@id='collap-on1_2']/div[1]/div[1]/div")
public static WebElement Status;

@FindBy(xpath=".//*[@id='collap-on1_2']/div[1]/div[2]/div")
public static WebElement SubStatus;

@FindBy(xpath=".//*[@id='divContents']/div[1]/div[3]/div[1]/span")
public static WebElement CaseId;

@FindBy(xpath ="//*[@id='collap-on1_1']/div[2]/div[2]/div")      
public static WebElement getcaseOwner;

@FindBy(id="XMLField_36003")//For Claims resolution By Field
public static WebElement claimresolutionby;

@FindBy(xpath=".//*[@id='divContents']/div[1]/div[3]/div[3]/span")
public static WebElement statusbknd;

@FindBy(xpath="//*[@id='collap-on1_2']/div[1]/div[2]/div")
public static WebElement substatusbknd;

@FindBy(xpath=".//*[@id='ui-id-2']/p")
public static WebElement clickscrutinytab;

@FindBy(id="Cas_ex1_86")
public static WebElement complainttype;

@FindBy(xpath=".//*[@id='Cas_ex1_87imgpick']/i")
public static WebElement complaintdescriptionsearch;

@FindBy(id="iv_0")
public static WebElement pickcomplaintdescription;

@FindBy(xpath=".//*[@id='collap-on1_1']/div[2]/div[2]/div")
public static WebElement AssignedTo;

@FindBy(id="RoleCombo")
public static WebElement claimBckndRole;

@FindBy(id="cmbrole")
public static WebElement selectRole;

@FindBy(id="ui-id-2")
public static WebElement clickSelectTab;

@FindBy(id="Cas_ex1_87imgpick")
public static WebElement selectCD;

@FindBy(id="Cas_ex1_86")
public static WebElement selectCT;

@FindBy(id="CAS_EX9_112")
public static WebElement cAgainstType;

@FindBy(id="cas_ex6_70")
public static WebElement rcaType;

@FindBy(id="Cas_ex4_32")
public static WebElement irdaProblem;

@FindBy(xpath="//body")
public static WebElement refreshpage;

@FindBy(xpath=".//*[@id='ui-id-3']/p")
public static WebElement claimGrievanceTab;

@FindBy(xpath=".//*[@id='ui-id-4']/p")
public static WebElement ClaimResolutionTab;

@FindBy(id="Cas_ex4_10")
public static WebElement f_History;//  field===Claims History

@FindBy(id="Cas_ex4_13")
public static WebElement f_ReasonReputataion;//  field===Reason for Repudiation

@FindBy(id="CAS_EX5_71")
public static WebElement f_RepuSummary;// field===Reason for Repudiation Summary

@FindBy(id="cas_ex7_9")
public static WebElement f_FactsCase;// field===Facts of the Case

@FindBy(id="cas_ex7_1imgpick")
public static WebElement f_StrongPoint;// field===Strong Points

@FindBy(xpath=".//*[@id='jqxWidgetb49e1d70']/div[1]/div")
public static WebElement checkbox_StrongPoint;

@FindBy(xpath=".//*[@id='imgsearch']/i")
public static WebElement selectsearch;

@FindBy(id="chkAllPicker")
public static WebElement selectvalue;

@FindBy(id="btnSelect")
public static WebElement btn_Select;

@FindBy(id="XMLField_36108")
public static WebElement f_StrongSummary;// field===Strong point Summary

@FindBy(id="Cas_ex2_18imgpick")
public static WebElement f_WeakPoint;// field===Weak Points

@FindBy(id="CAS_EX9_114")
public static WebElement f_WeakSummary;//field===Weak Point Summary

@FindBy(id="cas_ex7_38")
public static WebElement f_Recommendation;// field===Repudiation

@FindBy(id="Cas_ex4_12")
public static WebElement f_RecommendationSummary;// field===Repudiation Summary

@FindBy(id="XMLField_36003")
public static WebElement f_ResolutionBy;//field===Reolution By

@FindBy(id="cas_ex6_67")
public static WebElement f_IrdaResolution;//field===IRDA Resolution Comments

@FindBy(id="Cas_ex4_43")
public static WebElement f_AcceptanceStatus;//field===Acceptance Status

@FindBy(id="cas_ex9_62")
public static WebElement f_AmountReconsideration;//field===Claim Amount Reconsideration

@FindBy(xpath=".//*[@id='collap-on4_1']/div[7]/div[2]/div/div/div/i")
public static WebElement f_PaymentDate;//field===Claim Payment Date

@FindBy(id="Cas_ex4_53")
public static WebElement f_PaymentChequeNo;//field===Claim Payment Cheque Number

@FindBy(xpath=".//*[@id='collap-on4_1']/div[8]/div[2]/div/div/div/i")
public static WebElement f_PaymentChequeDate;//field===Claim Payment Cheque Date

@FindBy(xpath=".//*[@id='collap-on4_1']/div[9]/div[1]/div/div/div/i")
public static WebElement f_ResolutionLetterDate;//field===Insurer Resolution Letter Date

}
