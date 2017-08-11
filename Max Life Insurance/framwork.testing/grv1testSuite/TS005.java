package grv1testSuite;

import java.sql.SQLException;

import org.testng.annotations.Test;

import grv1.GRV1_TS005_Methods;

public class TS005 extends GRV1_TS005_Methods
{
	@Test()
	public void GRV1_TS005() throws InterruptedException, SQLException
	{
		CSEFlow();
		ScrutinyFlow();
		posFlow();
		nonGrvFlow();
	}

}

//Refactored on 10 Aug'17