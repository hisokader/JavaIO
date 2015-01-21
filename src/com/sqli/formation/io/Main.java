package com.sqli.formation.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		File file = new File("..\\file.txt");
		System.out.println(file.getAbsolutePath());
		try {
			writeInt(file,"Text lorem bbbb");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			readInt(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void writeInt(File file, String text) throws IOException {
		DataOutputStream out = new DataOutputStream(new BufferedOutputStream(
				new FileOutputStream(file)));
		for (int i = 0; i < text.length(); i++) {
			out.writeChar(text.charAt(i));
		}
		out.close();
		
	}

	private static void readInt(File file) throws IOException {
		DataInputStream in=new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
		int charactere;
		while((charactere=in.read())!=-1){
			System.out.print((char)charactere);
		}
		in.close();
	}
}
