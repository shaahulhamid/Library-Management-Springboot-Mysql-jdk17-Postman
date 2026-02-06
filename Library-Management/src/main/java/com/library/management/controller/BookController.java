package com.library.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.management.entity.Book;
import com.library.management.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {
	@Autowired
	private BookService bookService;

	//Add book:
	@PostMapping
	public ResponseEntity<Book> addBook(@RequestBody Book book){
		return ResponseEntity.ok(bookService.addBook(book));
	} 
	
	//Get All books:
	@GetMapping
	public ResponseEntity<List<Book>> getAllBooks(){
		return ResponseEntity.ok(bookService.getAllBooks());
	}
	
	//Get Book by ID:
	@GetMapping("/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable Long id){
		return ResponseEntity.ok(bookService.getBookById(id));
	}
	
	//Update Book 
	@PutMapping("/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book book){
		return ResponseEntity.ok(bookService.updateBook(id, book));
	}
	
	//Delete Book
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable Long id){
		bookService.deleteBook(id);
		return ResponseEntity.ok("Delete succesful!");
	}
}
