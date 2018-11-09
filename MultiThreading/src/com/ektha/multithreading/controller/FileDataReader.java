package com.ektha.multithreading.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileDataReader {
	
	public List<Record> process(String fileName) throws IOException {
		List<Record> records = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String line = null;
		while ((line = br.readLine()) != null) {
			Record record = new Record();
			
			String words[] = line.split("\\s");
			record.setId(Integer.parseInt(words[0]));
			record.setFirstname(words[1]);
			record.setLastname(words[2]);
			record.setAge(Integer.parseInt(words[3]));
			record.setEmail(words[4]);
			record.setPhone_num(Long.parseLong(words[5]));
			records.add(record);
		}
		System.out.println(records.size());
		return records;
	}

}
