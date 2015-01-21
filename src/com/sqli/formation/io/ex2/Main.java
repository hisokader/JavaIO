package com.sqli.formation.io.ex2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.sqli.formation.io.FileReader;
import com.sqli.formation.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		String path = "personDB.txt";
		FileWriter fileWriter = new FileWriter(path);
		FileReader fileReader = new FileReader(path);

		List<Person> persons = new ArrayList<Person>();
		Collections.addAll(persons, new Person("dd0", "sss0", new Date()),
				new Person("dd1", "sss1", new Date()), new Person("dd2",
						"sss2", new Date()));

		try {
			writeAllPerson(fileWriter, persons);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void writeAllPerson(FileWriter fileWriter,
			List<Person> persons) throws IOException {
			fileWriter.open();
			for (Person person : persons) {
				fileWriter.writeText(person.toString());
				System.out.println(person.toString());
			}
			fileWriter.close();
	}

}
