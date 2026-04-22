package in.teachtotech.bookapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.teachtotech.bookapp.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
