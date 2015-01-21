package com.sqli.formation.io.ex2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.sqli.formation.io.FileReader;
import com.sqli.formation.io.FileWriter;

public class Main {

	public static void main(String[] args) throws IOException, ParseException {
		String path = "personDB.txt";
		String pathToWriteIn = "personDB2.txt";
		FileWriter fileWriter = new FileWriter(pathToWriteIn);
		FileReader fileReader = new FileReader(path);

		// List<Person> persons = new ArrayList<Person>();
		// Collections.addAll(persons, new Person("dd0", "sss0", new Date()),
		// new Person("dd1", "sss1", new Date()), new Person("dd2",
		// "sss2", new Date()));

		// try {
		// writeAllPerson(fileWriter, persons);
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

		List<Person> persons = ReadAllPersons(fileReader);
		serializePersons(persons);
		//writeAllPerson(fileWriter, persons);

	}

	private static void serializePersons(List<Person> persons)
			throws FileNotFoundException, IOException {
		ObjectWriter ow=new ObjectWriter("serialize.txt");
		ow.open();
		for (Person person : persons) {
			ow.writeText(person);
		}
		ow.close();
	}

	private static List<Person> ReadAllPersons(FileReader fileReader)
			throws IOException {
		List<Person> persons = new ArrayList<Person>();
		fileReader.open();
		String line;
		while ((line = fileReader.read()) != null) {
			String[] person = line.split(";");
			persons.add(new Person(person[0], person[1], person[2]));
		}
		fileReader.close();
		return persons;
	}

	private static void writeAllPerson(FileWriter fileWriter,
			List<Person> persons) throws IOException {
		fileWriter.open();
		for (Person person : persons)
			fileWriter.writeText(person.toString());
		fileWriter.close();
	}

}
