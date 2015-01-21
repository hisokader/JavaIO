package com.sqli.formation.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

public class FileWriter implements WriteIO {
	private final File file;
	private BufferedWriter out;

	public FileWriter(String path) {
		file = new File(path);
	}

	@Override
	public void writeText(String text) throws IOException {
		out.append(text.subSequence(0, text.length() - 1));
		out.newLine();
	}

	@Override
	public void open() throws IOException {
		out = new BufferedWriter(new java.io.FileWriter(file));
	}

	@Override
	public void close() throws IOException {
		out.close();
	}

}
