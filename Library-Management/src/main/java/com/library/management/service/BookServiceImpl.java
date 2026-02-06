package com.library.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.management.entity.Book;
import com.library.management.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepo;
		
	@Override
	public Book addBook(Book book) {
		return bookRepo.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}

	@Override
	public Book getBookById(Long id) {
		return bookRepo.findById(id)
				.orElseThrow(() -> new RuntimeException("Cannot find Book with ID"+id));
	}

	@Override
	public Book updateBook(Long id, Book book) {
		Book current = getBookById(id);
		current.setTitle(book.getTitle());
		current.setAuthor(book.getAuthor());
		current.setAvailableCopies(book.getAvailableCopies());
		current.setCategory(book.getCategory());
		
		return bookRepo.save(current);
	}

	@Override
	public void deleteBook(Long id) {
		Book deleteBook = getBookById(id);
		bookRepo.delete(deleteBook);
	}

}
