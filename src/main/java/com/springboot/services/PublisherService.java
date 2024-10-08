package com.springboot.services;

import java.util.List;

import com.springboot.models.BookPublisher;

public interface PublisherService {
	List<BookPublisher> getList();
	void saveRecord(BookPublisher pub);
	void deleteRecord(int pid);
	BookPublisher getRecord(int pid);
}
