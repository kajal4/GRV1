package grv1testSuite;

import java.sql.SQLException;

import org.testng.annotations.Test;

import grv1.GRV1_TS0010_Methods;

public class TS0010and11and12and13 extends GRV1_TS0010_Methods
{
 @Test (enabled=false)
 public void GRV1_TS0010() throws InterruptedException, SQLException
 {
		CSEFlow();
		ScrutinyFlow();
		approver("Approved");
		financeppf();
		Pos();
		GrvFlow();
 }
 
 @Test (enabled=false)
 public void GRV1_TS0011() throws InterruptedException, SQLException
 {
	    CSEFlow();
	    ScrutinyFlow2();
		approver("Approved");
		financeppf();
		Pos();
		NonGrvFlow();
		
 }

 @Test (enabled=false)
 public void GRV1_TS0012() throws InterruptedException, SQLException
 {
	    CSEFlow();
	    ScrutinyFlow();
		approver("Rejected");
		GrvFlow();
 }
 
 @Test 
 public void GRV1_TS0013() throws InterruptedException, SQLException
 {
	    CSEFlow();
	    ScrutinyFlow2();
		approver("Rejected");
		NonGrvFlow();
 }
 
}

// Refactored on 11 Aug'17