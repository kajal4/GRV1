package grv1testSuite;

import java.sql.SQLException;

import org.testng.annotations.Test;

import grv1.GRV1_TS003_Methods;

public class TS003 extends GRV1_TS003_Methods
{
@Test
public void GRV1_TS003() throws InterruptedException, SQLException
{
	CSEFlow();
	ScrutinyFlow();
	poscfFlow();
	GrvFlow();
}

}

// Refactored on 10 aug'17