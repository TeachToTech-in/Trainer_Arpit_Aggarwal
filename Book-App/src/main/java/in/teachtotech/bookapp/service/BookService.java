package in.teachtotech.bookapp.service;

import java.util.List;

import in.teachtotech.bookapp.entity.Book;

public interface BookService {
	List<Book> retrieveAllBooks();
	
	String saveBook(Book book);
}
