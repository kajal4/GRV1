package grv1testSuite;

import java.sql.SQLException;

import org.testng.annotations.Test;

import grv1.GRV1_TS008_Methods;

public class TS008andTS009 extends GRV1_TS008_Methods
{
 @Test (enabled=false)
 public void GRV1_TS008() throws InterruptedException, SQLException
 {
		CSEFlow();
		ScrutinyFlow();
		posFlow();
		GrvFlow();
 }

 @Test 
 public void GRV1_TS009() throws InterruptedException, SQLException
 {
		CSEFlow();
		ScrutinyFlow2();
		posFlow();
		NonGrvFlow();
 }

}

// Refactored on 10 Aug'17
