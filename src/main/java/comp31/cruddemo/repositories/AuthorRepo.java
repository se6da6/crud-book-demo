package comp31.cruddemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import comp31.cruddemo.model.Author;

@Repository
public interface AuthorRepo extends CrudRepository<Author,Long> {
}
