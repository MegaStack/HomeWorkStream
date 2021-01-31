package com.gmail.oastro36;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter {

	private String[] arrayExt;

	public MyFileFilter(String... arrayExt) {
		super();
		this.arrayExt = arrayExt;
	}

	private boolean check(String ext) {
		for (String stringExt : arrayExt) {
			if (stringExt.equals(ext)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean accept(File folder) {
		int pointerIndex = folder.getName().lastIndexOf(".");
		if (pointerIndex == -1) {
			return false;
		}
		String ext = folder.getName().substring(pointerIndex + 1);
		return check(ext);
	}

}
