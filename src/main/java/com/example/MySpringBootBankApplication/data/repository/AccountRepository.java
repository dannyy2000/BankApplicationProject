package com.example.MySpringBootBankApplication.data.repository;

import com.example.MySpringBootBankApplication.data.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends MongoRepository<Account,String> {

   Optional<Account>findByAccountNumber(String accountNumber);
}