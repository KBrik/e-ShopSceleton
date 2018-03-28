package org.itstep.dao;

import org.itstep.model.Good;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodDAO extends JpaRepository<Good, Integer>{

	void addGood();
	void deleteGood();
	void updateGood();
	Good getGood();
}
