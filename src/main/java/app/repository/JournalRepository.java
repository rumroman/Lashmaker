package app.repository;

import app.model.Journal;
import org.springframework.data.repository.CrudRepository;

public interface JournalRepository extends CrudRepository<Journal,Integer> {
}
