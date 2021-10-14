package com.training.ee.rest.customer;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.training.ee.rest.Customer;

@Path("/v1/customer/query")
public class CustomerSearch {

    @Path("/get/one")
    @GET
    public Customer getCustomer(@QueryParam("un") final String username) {
        return null;
    }

    @Path("/get/all")
    @GET
    public List<Customer> getAll() {
        return null;

    }


    @Path("/get/by/name")
    @GET
    public List<Customer> getByName(@QueryParam("name") final String name) {
        return null;

    }

}
