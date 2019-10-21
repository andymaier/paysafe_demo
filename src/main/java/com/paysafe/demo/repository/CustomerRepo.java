package com.paysafe.demo.repository;

import com.paysafe.demo.domain.Customer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

  List<Customer> findAllByFirstnameContains(String firstname);

}
