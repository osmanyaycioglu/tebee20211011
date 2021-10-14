package com.training.ee.customer.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.training.ee.customer.mappers.CustomerMapper;
import com.training.ee.customer.service.CustomerManager;
import com.training.ee.customer.service.models.CustomerInternal;
import com.training.ee.rest.Customer;

@Path("/v1/customer/query")
public class CustomerSearch {

    @EJB
    private CustomerManager cm;

    @Path("/get/one")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Customer getCustomer(@QueryParam("un") final String username) {
        return CustomerMapper.mapTo(this.cm.getOne(username));
    }

    @Path("/get/all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> getAll() {
        List<CustomerInternal> allLoc = this.cm.getAll();
        List<Customer> customersLoc = new ArrayList<>();
        for (CustomerInternal customerInternalLoc : allLoc) {
            customersLoc.add(CustomerMapper.mapTo(customerInternalLoc));
        }
        return customersLoc;

    }


    @Path("/get/by/name")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> getByName(@QueryParam("name") final String name) {
        return null;

    }

}
