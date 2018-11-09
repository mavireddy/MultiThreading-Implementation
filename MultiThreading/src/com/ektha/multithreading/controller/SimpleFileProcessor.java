package com.ektha.multithreading.controller;

import java.io.IOException;
import java.util.List;

import com.ektha.multithreading.service.RecordProcessService;

public class SimpleFileProcessor {

	public static void main(String[] args) throws IOException {

		FileDataReader fileprocessor = new FileDataReader();
		List<Record> records = fileprocessor.process("C:\\bcjAugust18\\Develop\\Workspace\\MultiThreading\\data.txt");

		System.out.println(records);

		for (Record record : records) {
			RecordProcessService.Threadprocessrecord(record);
		}

	}

}
