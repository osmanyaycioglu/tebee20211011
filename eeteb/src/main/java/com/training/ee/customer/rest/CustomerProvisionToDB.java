package com.training.ee.customer.rest;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.training.ee.customer.mappers.CustomerMapper;
import com.training.ee.customer.service.CustomerManager;
import com.training.ee.rest.Customer;

@Path("/v1/customer/provision/db")
@Valid
@RequestScoped
public class CustomerProvisionToDB implements Serializable {

    private static final long serialVersionUID = 7606636330302915675L;

    @EJB
    private CustomerManager   cm;

    public CustomerProvisionToDB() {
        System.out.println("CustomerProvision yaratıldı");
    }

    @Path("/add")
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String add(@Valid final Customer customerParam) {
        this.cm.addDB(CustomerMapper.mapTo(customerParam));
        return "OK";
    }

    @Path("/remove")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String remove(@NotEmpty @QueryParam("cid") final Long customerId) {
        this.cm.removeFromDB(customerId);
        return "OK";
    }

    @Path("/update")
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String update(@Valid final Customer customerParam) {
        this.cm.updateDB(CustomerMapper.mapTo(customerParam));
        return "OK";
    }


}
