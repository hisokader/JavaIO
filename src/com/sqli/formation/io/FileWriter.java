package com.sqli.formation.io;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter implements WriteIO {
	private final File file;

	public FileWriter(String path) {
		file = new File(path);
	}

	@Override
	public void writeText(String text) throws IOException {
		DataOutputStream out = new DataOutputStream(new BufferedOutputStream(
				new FileOutputStream(file)));
		for (int i = 0; i < text.length(); i++) {
			out.writeChar(text.charAt(i));
		}
		out.close();

	}

}
