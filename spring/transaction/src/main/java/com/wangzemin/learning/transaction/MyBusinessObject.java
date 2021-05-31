package com.wangzemin.learning.transaction;

import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.interceptor.TransactionInterceptor;

import javax.transaction.Transactional;

/**
 * @author Wang Zemin(i539974)
 */
public class MyBusinessObject {
    @Transactional
    public void myBusinessMethod()throws Exception{
        DataSourceUtils s;
        TransactionStatus status = TransactionInterceptor.currentTransactionStatus();
        status.setRollbackOnly();
        // do some resources access.
        // return some result object or throw exception
    }
}
