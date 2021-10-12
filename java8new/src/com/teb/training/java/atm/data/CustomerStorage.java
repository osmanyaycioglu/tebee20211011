package com.teb.training.java.atm.data;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.teb.training.java.atm.models.Customer;

public class CustomerStorage implements ICustomerStorage {

    private final Map<String, Customer> mapLoc = new ConcurrentHashMap<>();

    @Override
    public void init() {
        this.mapLoc.put("osmany",
                        new Customer().setName("osman")
                                      .setSurname("yaycıoğlu")
                                      .setUsername("osmany")
                                      .setAmount(1000)
                                      .setPassword("1234"));
        this.mapLoc.put("aliveli",
                        new Customer().setName("ali")
                                      .setSurname("veli")
                                      .setUsername("aliveli")
                                      .setAmount(5000)
                                      .setPassword("1234"));
    }

    @Override
    public Customer getCustomer(final String usernameParam) {
        return this.mapLoc.get(usernameParam);
    }
}
