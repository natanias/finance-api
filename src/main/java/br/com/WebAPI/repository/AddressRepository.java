package br.com.WebAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.WebAPI.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
