package com.training.ee.customer.mappers;

import com.training.ee.customer.service.models.Address;
import com.training.ee.customer.service.models.CustomerInternal;
import com.training.ee.rest.Customer;

public class CustomerMapper {

    public static CustomerInternal mapTo(final Customer cp) {
        if (cp == null) {
            return null;
        }
        CustomerInternal c = new CustomerInternal();
        c.setUsername(cp.getUsername());
        c.setPassword(cp.getPassword());
        c.setName(cp.getName());
        c.setSurname(cp.getSurname());
        c.setAmount(cp.getAmount());
        c.setAddress(new Address().setCity(cp.getCity())
                                  .setStreet(cp.getStreet()));
        return c;
    }

    public static Customer mapTo(final CustomerInternal cp) {
        if (cp == null) {
            return null;
        }
        Customer c = new Customer();
        c.setUsername(cp.getUsername());
        c.setPassword(cp.getPassword());
        c.setName(cp.getName());
        c.setSurname(cp.getSurname());
        c.setAmount(cp.getAmount());
        c.setStreet(cp.getAddress()
                      .getStreet());
        c.setCity(cp.getAddress()
                    .getCity());
        return c;
    }

}
