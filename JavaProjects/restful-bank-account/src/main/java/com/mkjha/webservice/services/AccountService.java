package com.mkjha.webservice.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.webservice.domain.Account;

/**
 * @author mkjha
 *
 */
@Repository
public interface AccountService extends CrudRepository<Account, Long>{
    
    Account findOne(Long id);

}
