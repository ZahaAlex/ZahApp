package ro.zaha.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import ro.zaha.spring5webapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
