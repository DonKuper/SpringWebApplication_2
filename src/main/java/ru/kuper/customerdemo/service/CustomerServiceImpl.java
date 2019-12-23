package ru.kuper.customerdemo.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kuper.customerdemo.model.Customer;
import ru.kuper.customerdemo.repository.CustomerRepository;

import java.util.List;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer getById(Long id) {
        return customerRepository.findOne(id);
    }

    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    public void delete(Long id) {
        customerRepository.delete(id);
    }

    public List<Customer> getAll() {
        return null;
    }

}
