package com.paysafe.demo.api;

import com.paysafe.demo.domain.Customer;
import com.paysafe.demo.repository.CustomerRepo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customers")
public class CustomerController {

  @Autowired
  CustomerRepo customerRepo;

  @GetMapping
  public List<Customer> index() {
    return customerRepo.findAll();
  }

  @GetMapping("/contains/{contains}")
  public List<Customer> contains(@PathVariable String contains) {
    return customerRepo.findAllByFirstnameContains(contains);
  }

  @PostMapping("/create/{count}")
  public List<Customer> create(@PathVariable Integer count) {
    List<Customer> customers = new ArrayList<>();
    for (int i = 0; i < count; i++) {
      Customer customer = new Customer();
      customer.setFirstname(Math.random() + "firstname");
      customer.setLastname(Math.random() + "lastname");
      customers.add(customer);
      customerRepo.save(customer);
    }
    return customers;
  }
}
