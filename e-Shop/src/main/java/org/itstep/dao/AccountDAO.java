package org.itstep.dao;

import org.itstep.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDAO extends JpaRepository<Account, Integer> {

	void createAccount();
	void deleteAccount();
	void updateAccount();
	Account getAccount();
	
}
