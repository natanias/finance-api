package br.com.WebAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.WebAPI.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
