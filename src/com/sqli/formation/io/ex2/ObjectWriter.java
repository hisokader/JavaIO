package com.sqli.formation.io.ex2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.sqli.formation.io.WriteIO;


public class ObjectWriter implements WriteIO<Serializable>{
	private FileOutputStream file;
	private java.io.ObjectOutputStream stream;

	public ObjectWriter(String file) throws FileNotFoundException {
		this.file = new FileOutputStream(file);
	}

	@Override
	public void open() throws IOException {
		this.stream = new ObjectOutputStream(this.file);
	}

	@Override
	public void close() throws IOException {
		this.stream.close();
	}

	@Override
	public void writeText(Serializable obj) throws IOException {
		this.stream.writeObject(obj);		
	}
}
