package com.acc.training.customerapi.repository;

import java.util.HashMap;
import java.util.Map;

import com.acc.training.customerapi.model.Customer;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerMockRepo {

    private static final Map<String, Customer> tempCustomerDB = new HashMap<>();

    static {
        initCustomerDB();
    }

    private static void initCustomerDB() {
        Customer c1 = new Customer();
        c1.setCustomerId("12345");
        c1.setCustomerName("Sruthi");
        c1.setCustomerAddr("123-345 test rd");
        
        tempCustomerDB.put(c1.getCustomerId(), c1);
    }

    public Customer getCustomerDetails(String id) {
        return tempCustomerDB.get(id);
    }

    public Customer saveCustomerDetails(Customer cust) {
        tempCustomerDB.put(cust.getCustomerId(), cust);
        return tempCustomerDB.get(cust.getCustomerId());
    }
    
}