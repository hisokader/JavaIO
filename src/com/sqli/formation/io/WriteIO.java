package com.sqli.formation.io;

import java.io.IOException;

public interface WriteIO {
	public void open() throws IOException;
	public void writeText(String text) throws IOException;
	public void close() throws IOException;
}
