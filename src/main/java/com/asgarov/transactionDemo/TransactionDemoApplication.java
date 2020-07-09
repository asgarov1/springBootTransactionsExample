package com.asgarov.transactionDemo;

import com.asgarov.transactionDemo.domain.User;
import com.asgarov.transactionDemo.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@SpringBootApplication
@EnableTransactionManagement
public class TransactionDemoApplication {
    public static void main(String[] args) {
        var ctx = SpringApplication.run(TransactionDemoApplication.class, args);
        UserService userService = ctx.getBean(UserService.class);

        System.out.println("BEFORE METHOD: Transaction open: " + TransactionSynchronizationManager.isActualTransactionActive());
        userService.save(new User("Sam", "sam@winchester.com"));
        System.out.println("AFTER METHOD: Transaction open: " + TransactionSynchronizationManager.isActualTransactionActive());
    }
}
