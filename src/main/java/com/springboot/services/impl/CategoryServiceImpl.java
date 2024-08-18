package com.springboot.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.models.BookCategory;
import com.springboot.repositories.CategoryRepository;
import com.springboot.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService 
{
	@Autowired private CategoryRepository repo;

	public List<BookCategory> getList() 
	{
		return repo.findAll();
	}
	public void saveRecord(BookCategory cat) 
	{
		repo.save(cat);
	}
	public void deleteRecord(int cid) 
	{
		repo.deleteById(cid);
	}
	public BookCategory getRecord(int cid) 
	{
		return repo.findById(cid).orElse(null);
	}
}
