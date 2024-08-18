package com.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.models.BookCategory;

public interface CategoryRepository extends JpaRepository<BookCategory,Integer> {

}
