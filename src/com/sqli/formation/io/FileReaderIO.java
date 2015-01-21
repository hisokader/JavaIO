package com.sqli.formation.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderIO implements ReadIO {

	private final File file;
	private BufferedReader in;

	public FileReaderIO(String path) {
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
		in = new BufferedReader(new FileReader(file));
	}

	@Override
	public void close() throws IOException {
		in.close();
	}

}
