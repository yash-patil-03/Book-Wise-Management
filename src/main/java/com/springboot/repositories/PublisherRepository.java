package com.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.models.BookPublisher;

public interface PublisherRepository extends JpaRepository<BookPublisher,Integer> {

}
