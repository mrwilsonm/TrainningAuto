package com.choucair.automation.utilgeneric;

public class CHClassUtility {

	public String getMethodName() {
		return Thread.currentThread().getStackTrace()[2].getMethodName() + ": ";
	}
	
}
