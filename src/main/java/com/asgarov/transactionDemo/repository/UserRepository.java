package com.asgarov.transactionDemo.repository;

import com.asgarov.transactionDemo.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
