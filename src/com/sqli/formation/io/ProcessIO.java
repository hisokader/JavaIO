package com.sqli.formation.io;

public class ProcessIO {
	private final WriteIO writer;
	private final ReadIO reader;
	public ProcessIO(WriteIO writer, ReadIO reader) {
		this.writer = writer;
		this.reader = reader;
	}
	
	
}
