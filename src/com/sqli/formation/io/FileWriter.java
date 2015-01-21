package com.sqli.formation.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

public class FileWriter implements WriteIO<Serializable> {
	private final File file;
	private BufferedWriter out;

	public FileWriter(String path) {
		file = new File(path);
	}

	@Override
	public void writeText(Serializable text) throws IOException {
		out.append(((String)text).subSequence(0, ((String)text).length() - 1));
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
