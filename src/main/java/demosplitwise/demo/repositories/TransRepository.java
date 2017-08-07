package demosplitwise.demo.repositories;

import demosplitwise.demo.domain.Transactions;
import org.springframework.data.repository.CrudRepository;

public interface TransRepository extends CrudRepository<Transactions,Long>{
}
