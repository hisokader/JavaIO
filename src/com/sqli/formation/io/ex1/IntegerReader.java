package com.sqli.formation.io.ex1;


import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.sqli.formation.io.ReadIO;

public class IntegerReader implements ReadIO<Integer> {
	private final File file;
	private DataInputStream reader;

	public IntegerReader(String file) throws FileNotFoundException {
		this.file=new File(file);
	}


	@Override
	public void close() throws IOException {
		this.reader.close();
	}

	@Override
	public void open() throws IOException {
		this.reader = new DataInputStream(new FileInputStream(file));

	}

	@Override
	public Integer read() throws IOException {
		return reader.readInt();
	}

}
