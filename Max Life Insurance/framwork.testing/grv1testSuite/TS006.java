package grv1testSuite;

import java.sql.SQLException;

import org.testng.annotations.Test;

import grv1.GRV1_TS006_Methods;

public class TS006 extends GRV1_TS006_Methods
{
	@Test 
 public void GRV1_TS006 () throws InterruptedException, SQLException
 {
	    CSEFlow();
		ScrutinyFlow();
		ITFlow();
		Financeppf();
		GrvFlow();
 }
	
}

//Refactored on 10 Aug'17
