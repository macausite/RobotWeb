package com.robotable.RobotWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import com.robotable.RobotWeb.model.Books;
import com.robotable.RobotWeb.service.BooksService;

/*Reference from:https://www.javatpoint.com/spring-boot-crud-operations*/
@RestController
public class BookController {
	@Autowired
	BooksService booksService;

	@GetMapping("/book")
	private List<Books> getAllBook() {
		return booksService.getAllBooks();
	}

	@GetMapping("book/{bookid}")
	private Books getBooks(@PathVariable("bookid") int bookid) {
		return booksService.getBooksById(bookid);
	}

	@DeleteMapping("/book/{bookid}")
	private void deleteBook(@PathVariable("bookid") int bookid) {
		booksService.delete(bookid);
	}

	@PostMapping("/book")
	private int saveBook(@RequestBody Books books) {
		booksService.saveOrUpdate(books);
		return books.getBookid();
	}
	@PutMapping("/book")
	private Books update(@RequestBody Books books)
	{
	booksService.saveOrUpdate(books);
	return books;
}

}