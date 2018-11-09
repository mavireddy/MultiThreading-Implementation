package com.ektha.multithreading.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.ektha.multithreading.controller.Record;
import com.ektha.multithreading.dao.RecordProcessDao;

public class RecordProcessService {

	public static void Threadprocessrecord(Record record) {

		RecordProcessDao.insertData(record);
		System.out.println(Thread.currentThread().getName() + " : " + record.toString());

	}

}
