package com.robotable.RobotWeb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robotable.RobotWeb.model.Books;
import com.robotable.RobotWeb.repository.BooksRepository;

@Service
public class BooksService {
@Autowired
BooksRepository booksRepository;
	public List<Books> getAllBooks() {
		List<Books> books=new ArrayList<Books>();
		booksRepository.findAll().forEach(books1->books.add(books1));
		return books;
	
	}

	public Books getBooksById(int bookid) {
		
		return booksRepository.findById(bookid).get();
	}

	public void delete(int bookid) {
		booksRepository.deleteById(bookid);
		
	}

	public void saveOrUpdate(Books books) {
	booksRepository.save(books);
		
	}
private void update(Books books, int bookid)
{
booksRepository.save(books);	
}
}
