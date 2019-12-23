package ru.kuper.customerdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kuper.customerdemo.model.Customer;

/**
 * Interface for {@link Customer} class
 */

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
