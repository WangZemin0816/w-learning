package com.wangzemin.learning.transaction;

import liquibase.pro.packaged.D;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionTemplate;

@SpringBootApplication
public class TransactionApplication {

    public static void main(String[] args) {

        PlatformTransactionManager transactionManager = new DataSourceTransactionManager();



        SpringApplication.run(TransactionApplication.class, args);
    }

}
