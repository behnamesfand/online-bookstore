package com.behnamesfandmaz.onlinebookstore.config;


import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.behnamesfandmaz.onlinebookstore.entity.Book;
import com.behnamesfandmaz.onlinebookstore.entity.BookCategory;



@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer{
	
	
	@Autowired
	private EntityManager entityManager;
	
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream()
				.map(Type::getJavaType)
				.toArray(Class[]::new));
				
	}
}
