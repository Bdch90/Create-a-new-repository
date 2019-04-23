package orm.codegym.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import orm.codegym.model.Customer;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
}