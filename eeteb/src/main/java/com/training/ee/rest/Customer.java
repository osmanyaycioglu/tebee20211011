package com.training.ee.rest;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlRootElement;

import com.training.ee.rest.custom.validation.StartWith;

@XmlRootElement
public class Customer {

    @QueryParam("un")
    @NotEmpty
    @Size(min = 5, max = 15, message = "Username 5 ile 10 karakter arasında olmalı")
    private String  username;
    @HeaderParam("pass")
    @NotEmpty
    @Size(min = 8, max = 15)
    private String  password;
    @PathParam("name")
    @NotEmpty
    @Size(min = 2, max = 15)
    private String  name;
    @QueryParam("sn")
    @NotEmpty
    @Size(min = 3, max = 20)
    @StartWith("soy:")
    private String  surname;
    @HeaderParam("amount")

    @Max(50_000_000)
    @Min(100)
    @Positive
    private Integer amount;

    public String getUsername() {
        return this.username;
    }

    public Customer setUsername(final String usernameParam) {
        this.username = usernameParam;
        return this;
    }


    public String getName() {
        return this.name;
    }


    public Customer setName(final String nameParam) {
        this.name = nameParam;
        return this;
    }


    public String getSurname() {
        return this.surname;
    }


    public Customer setSurname(final String surnameParam) {
        this.surname = surnameParam;
        return this;
    }

    public String getPassword() {
        return this.password;
    }

    public Customer setPassword(final String passwordParam) {
        this.password = passwordParam;
        return this;
    }

    @Override
    public String toString() {
        return "Customer [username="
               + this.username
               + ", password="
               + this.password
               + ", name="
               + this.name
               + ", surname="
               + this.surname
               + ", amount="
               + this.amount
               + "]";
    }

    public Integer getAmount() {
        return this.amount;
    }

    public Customer setAmount(final Integer amountParam) {
        this.amount = amountParam;
        return this;
    }


}
