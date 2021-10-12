package com.teb.training.java.atm.data;

import com.teb.training.java.atm.models.Customer;

public interface ICustomerStorage {

    void init();

    Customer getCustomer(String username);

}
