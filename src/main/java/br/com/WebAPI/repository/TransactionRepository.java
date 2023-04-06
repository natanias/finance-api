package br.com.WebAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.WebAPI.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	
}
