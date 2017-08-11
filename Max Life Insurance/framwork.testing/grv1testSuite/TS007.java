package grv1testSuite;

import java.sql.SQLException;

import org.testng.annotations.Test;

import grv1.GRV1_TS007_Methods;

public class TS007 extends GRV1_TS007_Methods
{
	@Test

	public void GRV1_TS007 () throws InterruptedException, SQLException
	{
		    CSEFlow();
			ScrutinyFlow();
			ITFlow();
			Financeppf();
			NonGrvFlow();
	}
}

//Refactored on 10 Aug'17