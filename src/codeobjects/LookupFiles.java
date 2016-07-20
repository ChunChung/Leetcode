package codeobjects;

import java.io.File;



public class LookupFiles {
	
	
	private String path;
	LookupFiles (String path) {
		this.path = path;
	}
	
	public void lookupDirectory() {
		File folder = new File(this.path);
		for (File fd :folder.listFiles()) {
			if (fd.isFile()) {
				System.out.println("File: " + fd.getName() + " " + fd.length());
			}
		}
	}
}