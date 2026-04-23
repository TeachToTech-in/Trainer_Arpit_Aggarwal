package in.teachtotech.bookapp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import in.teachtotech.bookapp.entity.Book;
import in.teachtotech.bookapp.repository.BookRepository;
import in.teachtotech.bookapp.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	private BookRepository repository;
	
	public BookServiceImpl(BookRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Book> retrieveAllBooks() {
		return repository.findAll();
	}

	@Override
	public String saveBook(Book book) {
		repository.save(book);
		return "Book Added Successfully !!";
	}
}
