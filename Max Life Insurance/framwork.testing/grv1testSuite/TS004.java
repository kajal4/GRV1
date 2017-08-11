package grv1testSuite;

import java.sql.SQLException;

import org.testng.annotations.Test;

import grv1.GRV1_TS004_Methods;

public class TS004 extends GRV1_TS004_Methods
{
 @Test ()
 public void GRV1_TS004 () throws InterruptedException, SQLException
 {
	CSEFlow();
	ScrutinyFlow();
	posFlow();
	GrvFlow();
	 
 }
	
}
//Refactored on 10 Aug'17