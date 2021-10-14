package com.training.ee.customer.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

import com.training.ee.customer.data.CustomerStorage;
import com.training.ee.customer.service.models.CustomerInternal;

@LocalBean
@Singleton
public class CustomerManager {

    @EJB
    private CustomerStorage cs;

    public void add(final CustomerInternal customerParam) {
        this.cs.add(customerParam);
    }

    public void remove(final String username) {
        this.cs.remove(username);
    }

    public void update(final CustomerInternal customerParam) {
        this.cs.update(customerParam);
    }

    public CustomerInternal getOne(final String usernameParam) {
        return this.cs.getOne(usernameParam);
    }

    public List<CustomerInternal> getAll() {
        return this.cs.getAll();
    }

}
