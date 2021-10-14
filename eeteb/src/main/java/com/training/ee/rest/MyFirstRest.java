package com.training.ee.rest;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/first")
public class MyFirstRest {


    @Path("/hello2/{abc}/devam/{xyz}")
    @GET
    @Produces("text/plain")
    public String hello2(@PathParam("abc") final String name,
                         @PathParam("xyz") final String surname) {
        return "Hello from MyFirstRest " + name + " " + surname;
    }

    @Path("/hello3")
    @GET
    @Produces("text/plain")
    public String hello3(@QueryParam("isim") final String name,
                         @QueryParam("soyisim") final String surname) {
        return "Hello from MyFirstRest " + name + " " + surname;
    }

    @Path("/hello4/{abc}")
    @GET
    @Produces("text/plain")
    public String hello4(@PathParam("abc") final String name,
                         @QueryParam("xyz") final String surname) {
        return "Hello from MyFirstRest " + name + " " + surname;
    }

    @Path("/hello5")
    @POST
    //    @Produces("text/plain")
    //    @Consumes("application/json")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String hello5(final Customer customerParam) {
        return "Hello 5 object " + customerParam;
    }

    @Path("/hello6")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Customer hello6(final Customer customerParam) {
        customerParam.setName("test");
        return customerParam;
    }

    @Path("/hello7")
    @POST
    @Produces({
                MediaType.APPLICATION_JSON,
                MediaType.APPLICATION_XML
    })
    @Consumes({
                MediaType.APPLICATION_JSON,
                MediaType.APPLICATION_XML
    })
    public Customer hello7(final Customer customerParam) {
        customerParam.setName("test");
        return customerParam;
    }

    // Önermiyorum
    @Path("/hello8/{name}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Customer hello8(@BeanParam final Customer customerParam) {
        customerParam.setName("test");
        return customerParam;
    }

    // Önermiyorum
    @Path("/hello9")
    @POST
    @Produces("text/plain")
    public String hello9(@FormParam("abc") final String name,
                         @FormParam("xyz") final String surname) {
        return "Hello from MyFirstRest " + name + " " + surname;
    }

    @Path("/hello10")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Customer hello6(final CustomerPerson customerParam) {
        System.out.println(customerParam.getPerson());
        System.out.println(customerParam.getCustomer());
        customerParam.getCustomer()
                     .setName("test");
        return customerParam.getCustomer();
    }


    @Path("/hello")
    @GET
    public String hello() {
        return "Hello from MyFirstRest";
    }

    @Path("/hello")
    @POST
    public String helloPost() {
        return "Hello from MyFirstRest Post";
    }

    @Path("/hello")
    @PUT
    public String helloPut() {
        return "Hello from MyFirstRest Put";
    }

    @Path("/greet")
    @PUT
    public String abc() {
        return "Hello from MyFirstRest Put 2";
    }

}
