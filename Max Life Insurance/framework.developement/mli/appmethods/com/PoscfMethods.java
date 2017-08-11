package mli.appmethods.com;

import org.openqa.selenium.JavascriptExecutor;

import mli.pom.com.PoscfObjects;

public class PoscfMethods extends GrvMethods
{
	
public static void Forwardee_section()
{
 PoscfObjects.Forwardee_section.click();	
}

public static void Forwardee1_comment(String ar)
{
	PoscfObjects.Forwardee1_comment.sendKeys(ar);
}
	
public static void Forwardee1_decision_picker()
{
	JavascriptExecutor jse= (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].scrollIntoView(true)", PoscfObjects.Forwardee1_decision_picker);
	PoscfObjects.Forwardee1_decision_picker.click();
}

public static void decision_search_box(String ar) throws InterruptedException
{
	Thread.sleep(1500);
	driver.switchTo().activeElement();
	PoscfObjects.Forwardee1_decision_txt.sendKeys(ar);
	PoscfObjects.Decision_search_icon.click();
	Thread.sleep(1000);
	PoscfObjects.Decision.click();
	driver.switchTo().defaultContent();
	Thread.sleep(800);
}

public void decision_search_box1(String ar) throws InterruptedException
{
	Thread.sleep(1500);
	driver.switchTo().activeElement();
	PoscfObjects.Forwardee1_decision_txt.sendKeys(ar);
	PoscfObjects.Decision_search_icon.click();
	Thread.sleep(1000);
	PoscfObjects.Decision1.click();
	driver.switchTo().defaultContent();
	Thread.sleep(800);
}

public void POSCFsave ()
{
 PoscfObjects.POSCFsave.click();	
}

public void Forwardee2_comment(String ar)
{
	PoscfObjects.Comment2.sendKeys(ar);
}

public void Forwardee2_decision_picker()
{
	JavascriptExecutor jse= (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].scrollIntoView(true)", PoscfObjects.Forwardee2_decision_picker);
	PoscfObjects.Forwardee2_decision_picker.click();
}
}

