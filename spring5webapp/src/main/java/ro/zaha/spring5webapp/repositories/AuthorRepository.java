package ro.zaha.spring5webapp.repositories;


import org.springframework.data.repository.CrudRepository;
import ro.zaha.spring5webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
