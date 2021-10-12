package com.teb.training.java.atm.business;

import java.util.List;
import java.util.Scanner;

import com.teb.training.java.atm.common.LoginException;
import com.teb.training.java.atm.data.ICustomerStorage;
import com.teb.training.java.atm.models.Customer;

public class CustomerManager {

    private final ICustomerStorage customerStorage;

    public CustomerManager(final ICustomerStorage customerStorageParam) {
        this.customerStorage = customerStorageParam;
        this.customerStorage.init();
    }

    public List<ICustomerProcess> getCustomerProcesses() {
        return CustomerProcessFactory.getCustomerProcesses();
    }

    public void executeProcess(final ICustomerProcess iCustomerProcessLoc,
                               final Customer customerParam,
                               final Scanner scannerParam) {
        iCustomerProcessLoc.customerTask()
                           .accept(customerParam,
                                   scannerParam);
    }


    public Customer login(final String username,
                          final String password) throws LoginException {
        Customer customerLoc = this.customerStorage.getCustomer(username);
        if (customerLoc == null) {
            throw new LoginException("Böyle bir user yok : " + username);

        }
        if (!password.equals(customerLoc.getPassword())) {
            throw new LoginException("Password eşleşmedi : " + username);
        }
        return customerLoc;
    }

    public Customer getCustomer(final String customerUsernameParam) {
        return this.customerStorage.getCustomer(customerUsernameParam);
    }

}
