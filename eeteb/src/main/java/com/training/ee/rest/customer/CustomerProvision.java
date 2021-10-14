package com.training.ee.rest.customer;

import java.io.Serializable;

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

import com.training.ee.rest.Customer;

@Path("/v1/customer/provision")
@Valid
@RequestScoped
//@SessionScoped - Rest de kullanılmaz
//@ApplicationScoped
public class CustomerProvision implements Serializable {

    private static final long serialVersionUID = 7606636330302915675L;

    public CustomerProvision() {
        System.out.println("CustomerProvision yaratıldı");
    }

    @Path("/add")
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String add(@Valid final Customer customerParam) {
        return "OK";
    }

    @Path("/remove")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String remove(@NotEmpty @QueryParam("un") final String username) {
        return "OK";
    }

    @Path("/update")
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String update(@Valid final Customer customerParam) {
        return "OK";
    }


}
