package com.springboot.services.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.models.Book;
import com.springboot.repositories.BookRepository;
import com.springboot.services.BookService;

@Service
public class BookServiceImpl implements BookService 
{
	@Autowired private BookRepository repo;

	public List<Book> getList() 
	{
		return repo.findAll();
	}
	public void saveRecord(Book book) 
	{
		repo.save(book);
	}
	public void deleteRecord(int bid) 
	{
		repo.deleteById(bid);
	}
	public Book getRecord(int bid) 
	{
		return repo.findById(bid).orElse(null);
	}
}
