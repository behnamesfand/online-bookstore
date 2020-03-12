package com.behnamesfandmaz.onlinebookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.behnamesfandmaz.onlinebookstore.repository.BookRepository;

@SpringBootApplication
public class OnlineBookStoreApplication {
	
	
	@Autowired
	static
	BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(OnlineBookStoreApplication.class, args);

	}
	
	
	

}
