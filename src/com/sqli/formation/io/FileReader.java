package com.sqli.formation.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class FileReader implements ReadIO<String> {

	private final File file;
	private BufferedReader in;

	public FileReader(String path) {
		file = new File(path);
		
	}

	@Override
	public String read() throws IOException {
		if (in.ready())
			return in.readLine();
		return "";
	}

	@Override
	public void open() throws IOException {
		in = new BufferedReader(new java.io.FileReader(file));
	}

	@Override
	public void close() throws IOException {
		in.close();
	}

}
