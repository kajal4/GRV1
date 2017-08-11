package mli.appmethods.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import mli.pom.com.ScrutinyObjects;

public abstract class ScrutinyMethods extends CSEMethods
{
 
	public void ScrutinySection()
	{
		ScrutinyObjects.link_ScrutinySection.click();

	}
		
	public void EnterCD(String ar) throws InterruptedException
	{
		ScrutinyObjects.txt_CD.sendKeys(ar);
//		Thread.sleep(2500);
		WebDriverWait wait= new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ui-id-18"))));
		ScrutinyObjects.txt_CD.sendKeys(Keys.DOWN,Keys.ENTER);

	}
	
	public void RCAType(String ar) throws InterruptedException
	{
		ScrutinyObjects.txt_RCAType.sendKeys(ar);
		Thread.sleep(600);
		ScrutinyObjects.txt_RCAType.sendKeys(Keys.DOWN,Keys.ENTER);
		
	}
	
	public void RCAComment(String ar)
	{
	ScrutinyObjects.txt_RCAComment.sendKeys(ar);
	}
	
	public void IRDAComment(String ar)
	{
	ScrutinyObjects.IRDA_txt.sendKeys(ar);
	}
	public void edit()
	{
	JavascriptExecutor jse= (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].scrollIntoView(true)", ScrutinyObjects.btn_edit);
	ScrutinyObjects.btn_edit.click();
	}
	
	public void refresh()
	{
		driver.navigate().refresh();
	}
	
    public void submenu(String submenu) throws InterruptedException
    {
    ScrutinyObjects.txt_submenu.sendKeys(submenu);
    WebDriverWait wait= new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ui-id-15"))));
    ScrutinyObjects.txt_submenu.sendKeys(Keys.DOWN,Keys.ENTER);
    }
	
}
