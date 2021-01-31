package com.gmail.oastro36;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyCopyFile {

	public static void fileCopy(File in, File out) throws IOException {
		byte[] buffer = new byte[1024 * 1024];
		int readByte = 0;
		try (FileInputStream fis = new FileInputStream(in); FileOutputStream fos = new FileOutputStream(out)) {
			for (; (readByte = fis.read(buffer)) > 0;) {
				fos.write(buffer, 0, readByte);
			}
		} catch (IOException e) {
			throw e;
		}
	}

}
