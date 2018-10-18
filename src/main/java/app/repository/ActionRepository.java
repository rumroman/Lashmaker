package app.repository;

import app.model.Action;
import org.springframework.data.repository.CrudRepository;

public interface ActionRepository extends CrudRepository<Action,Integer> {
}
