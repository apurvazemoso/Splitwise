package demosplitwise.demo.repositories;

import demosplitwise.demo.domain.UserTransaction;
import org.springframework.data.repository.CrudRepository;

public interface UserTransactionRepository extends CrudRepository<UserTransaction,Long> {

}
