package orm.codegym.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import orm.codegym.model.Customer;
import orm.codegym.repository.CustomerRepository;
import orm.codegym.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findOne(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.delete(id);
    }
}