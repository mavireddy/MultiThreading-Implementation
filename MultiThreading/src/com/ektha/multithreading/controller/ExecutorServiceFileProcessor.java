package com.ektha.multithreading.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.ektha.multithreading.service.RecordProcessService;

public class ExecutorServiceFileProcessor {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileDataReader fileprocessor = new FileDataReader();
		List<Record> records = fileprocessor.process("C:\\bcjAugust18\\Develop\\Workspace\\MultiThreading\\data.txt");
		ExecutorService es = Executors.newFixedThreadPool(10);
	

	for (Record record : records) {
		RecordRunnable recRunnable = new RecordRunnable(record);
		es.execute(recRunnable);  

	}
	es.shutdown();
}
}
