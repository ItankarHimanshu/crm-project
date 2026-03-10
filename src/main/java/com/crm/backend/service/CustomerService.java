package com.crm.backend.service;

import com.crm.backend.exception.ResourceNotFoundException;
import com.crm.backend.model.Customer;
import com.crm.backend.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository repository;

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    public Customer save(Customer customer) {
        return repository.save(customer);
    }

    public Customer update(Long id, Customer c) {

        Customer existing = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found"));

        existing.setName(c.getName());
        existing.setEmail(c.getEmail());

        return repository.save(existing);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
