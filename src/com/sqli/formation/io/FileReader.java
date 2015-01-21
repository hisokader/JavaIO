package com.sqli.formation.io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class FileReader implements ReadIO{

	private final File file;
	
	public FileReader(String path) {
		file=new File(path);
	}
	

	@Override
	public String read() throws IOException {
		DataInputStream in=new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
		StringBuilder buffer=new StringBuilder();
		int charactere;
		while((charactere=in.read())!=-1){
			buffer.append((char)charactere);
		}
		in.close();
		return buffer.toString();
	}

}
