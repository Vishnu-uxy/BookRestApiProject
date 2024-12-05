package com.cts.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Repository;

import com.cts.model.Book;
@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
	
	List<Book> findByTitle(String title);
	
	@Query("SELECT b FROM Book b WHERE b.publishDate>?1")
	List<Book> findByPublishedDateAfter(LocalDate Date);
	
	

}
