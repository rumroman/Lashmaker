package app.repository;

import app.entity.CustomerFeedback;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<CustomerFeedback,Long> {
}
