package com.sqli.formation.io;

import java.io.IOException;
import java.io.Serializable;

public interface ReadIO <O extends Serializable>{
	public void open() throws IOException;
	public O read() throws IOException;
	public void close() throws IOException;
}
