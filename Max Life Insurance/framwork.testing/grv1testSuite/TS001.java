package grv1testSuite;

import java.sql.SQLException;

import grv1.GRV1_TS001_Methods;

import org.testng.annotations.Test;


public class TS001 extends GRV1_TS001_Methods {
 
	@Test
	public void GRV1_TS001() throws InterruptedException, SQLException
	{
		
		CSEFlow();
		ScrutinyFlow();
		GrvFlow();
	}
}

// refactored on 10 aug'17