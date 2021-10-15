package com.training.ee.customer.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

import com.training.ee.customer.data.CustomerDao;
import com.training.ee.customer.data.CustomerStorage;
import com.training.ee.customer.service.models.CustomerInternal;

@LocalBean
@Singleton
public class CustomerManager {

    @EJB
    private CustomerStorage cs;

    @EJB
    private CustomerDao     customerDao;

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

    public void addDB(final CustomerInternal customerParam) {
        this.customerDao.add(customerParam);
    }

    public void removeFromDB(final Long customerId) {
        this.customerDao.remove(customerId);
    }

    public void updateDB(final CustomerInternal customerParam) {
        this.customerDao.update(customerParam);
    }

    public CustomerInternal getOneFromDB(final Long customerId) {
        return this.customerDao.getOne(customerId);
    }

    public List<CustomerInternal> getAllDB() {
        return this.customerDao.getAll();
    }

    public List<CustomerInternal> getByNameDb(final String nameParam) {
        return this.customerDao.getByName(nameParam);
    }

}
