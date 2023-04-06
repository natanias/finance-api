package br.com.WebAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.WebAPI.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
