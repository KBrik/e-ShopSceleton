package org.itstep.dao;

import org.itstep.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDAO extends JpaRepository<Account, Integer> {

//    @Query(value = "SELECT * FROM account")
//    List<Account> findAll(Account login);
}
