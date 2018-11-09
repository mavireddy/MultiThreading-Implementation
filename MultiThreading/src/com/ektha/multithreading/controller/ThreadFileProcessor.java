package com.ektha.multithreading.controller;

import java.io.IOException;
import java.util.List;

import com.ektha.multithreading.service.RecordProcessService;

public class ThreadFileProcessor {

	public static void main(String[] args) throws IOException {

		FileDataReader filedatareader = new FileDataReader();
		List<Record> records = filedatareader.process("C:\\bcjAugust18\\Develop\\Workspace\\MultiThreading\\data.txt");
		int recordsInEachThread = (int) (records.size() / 2);
		System.out.println(recordsInEachThread);

		/*RecordProcessService fs1 = new RecordProcessService(records.subList(0, recordsInEachThread));
		RecordProcessService fs2 = new RecordProcessService(records.subList(recordsInEachThread, records.size()));
		*/
		/*RecordRunnable recordrunnable1 = new RecordRunnable(records.subList(0, recordsInEachThread));
		
		RecordRunnable recordrunnable2 = new RecordRunnable(records.subList(recordsInEachThread, records.size()));

		Thread t1 = new Thread(recordrunnable1);
		Thread t2 = new Thread(recordrunnable2);
		
		t1.start();
		t2.start();*/
		
		for(Record record: records.subList(0, recordsInEachThread))
		{
			RecordRunnable recordrunnable1 = new RecordRunnable(record);
			Thread t1 = new Thread(recordrunnable1);
			t1.start();
		}
		
		for(Record record: records.subList(recordsInEachThread, records.size()))
		{
			RecordRunnable recordrunnable2 = new RecordRunnable(record);
			Thread t2 = new Thread(recordrunnable2);
			t2.start();
		}
	}

}

