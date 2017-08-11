package grv1testSuite;

import java.sql.SQLException;

import grv1.GRV1_TS002_Methods;

import org.testng.annotations.Test;

public class TS002 extends GRV1_TS002_Methods
{
@Test
public void GRV1_TS002() throws InterruptedException, SQLException
{
	CSEFlow();
	ScrutinyFlow();
	poscfFlow();
	nonGrvFlow();
}
	
}

// some changes are there...