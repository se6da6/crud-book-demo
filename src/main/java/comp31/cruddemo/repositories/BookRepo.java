package comp31.cruddemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import comp31.cruddemo.model.Book;

@Repository
public interface BookRepo extends CrudRepository<Book,Long>{
}
