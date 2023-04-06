package br.com.WebAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.WebAPI.model.RefTransactionType;


public interface RefTransactionTypeRepository extends JpaRepository<RefTransactionType, Long> {

}
