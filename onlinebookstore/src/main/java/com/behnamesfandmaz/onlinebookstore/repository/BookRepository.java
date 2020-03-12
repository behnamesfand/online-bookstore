package com.behnamesfandmaz.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.behnamesfandmaz.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

	
}
