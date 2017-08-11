package mli.appmethods.com;

import mli.pom.com.ApproverObjects;

import org.openqa.selenium.support.ui.Select;

public class ApproverMethods extends PoscfMethods
{

	public void Approverdecision(String ar)
	{
		Select select= new Select(ApproverObjects.approver_decision);
		select.selectByValue(ar);
	}
	
	public void Approvercomment(String ar)
	{
		ApproverObjects.approver_comment.sendKeys(ar);
	}
}
