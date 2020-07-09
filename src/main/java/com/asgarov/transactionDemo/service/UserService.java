package com.asgarov.transactionDemo.service;

import com.asgarov.transactionDemo.domain.User;
import com.asgarov.transactionDemo.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public void save(User user) {
        System.out.println("INSIDE METHOD: Transaction open: " + TransactionSynchronizationManager.isActualTransactionActive());
        userRepository.save(user);
        System.out.println("USER " + user.getName() + " SAVED!");
    }
}
