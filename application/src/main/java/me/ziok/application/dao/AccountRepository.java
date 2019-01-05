package me.ziok.application.dao;

import me.ziok.application.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
public interface AccountRepository extends JpaRepository<Account, Integer> {
    Account findByUserName(String userName);
}