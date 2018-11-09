package com.ektha.multithreading.controller;

import java.util.List;

import com.ektha.multithreading.dao.RecordProcessDao;
import com.ektha.multithreading.service.RecordProcessService;

public class RecordRunnable implements Runnable {

	Record record;

	public RecordRunnable(Record record) {
		super();
		this.record = record;
	}

	public void run() {

		RecordProcessService.Threadprocessrecord(record);

	}

}
