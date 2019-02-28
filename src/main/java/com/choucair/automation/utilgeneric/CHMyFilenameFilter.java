package com.choucair.automation.utilgeneric;

import java.io.File;
import java.io.FilenameFilter;

public class CHMyFilenameFilter implements FilenameFilter {

	@Override
	public boolean accept(File flDirectory, String strFileName) {
		if (strFileName.endsWith(".png")) {
            return true;
         } else {
        	return false;
        }
	}
	
}
