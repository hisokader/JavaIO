package com.sqli.formation.io;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String path="..\\file.txt";
		WriteIO writer=new FileWriter(path);
		ReadIO reader=new FileReader(path);
		try {
			writer.writeText("hello");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			System.out.println(reader.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
