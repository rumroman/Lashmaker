package app.repository;

import app.entity.Action;
import org.springframework.data.repository.CrudRepository;

public interface ActionRepository extends CrudRepository<Action,Long> {
}
