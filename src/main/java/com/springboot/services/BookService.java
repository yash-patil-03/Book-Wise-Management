package com.springboot.services;

import java.util.List;

import com.springboot.models.Book;

public interface BookService {
	List<Book> getList();
	void saveRecord(Book book);
	void deleteRecord(int bid);
	Book getRecord(int bid);
}
