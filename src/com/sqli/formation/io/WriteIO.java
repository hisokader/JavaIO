package com.sqli.formation.io;

import java.io.IOException;
import java.io.Serializable;

public interface WriteIO <O extends Serializable>{
	public void open() throws IOException;
	public void writeText(O obj) throws IOException;
	public void close() throws IOException;
}
