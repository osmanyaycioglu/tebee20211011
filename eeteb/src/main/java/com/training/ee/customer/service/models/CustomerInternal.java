package com.training.ee.customer.service.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CustomerInternal {

    @Id
    @GeneratedValue
    private Long    customerId;
    private String  username;
    private String  password;
    private String  name;
    private String  surname;
    private Integer amount;

    public String getUsername() {
        return this.username;
    }

    public CustomerInternal setUsername(final String usernameParam) {
        this.username = usernameParam;
        return this;
    }


    public String getName() {
        return this.name;
    }


    public CustomerInternal setName(final String nameParam) {
        this.name = nameParam;
        return this;
    }


    public String getSurname() {
        return this.surname;
    }


    public CustomerInternal setSurname(final String surnameParam) {
        this.surname = surnameParam;
        return this;
    }

    public String getPassword() {
        return this.password;
    }

    public CustomerInternal setPassword(final String passwordParam) {
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

    public CustomerInternal setAmount(final Integer amountParam) {
        this.amount = amountParam;
        return this;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(final Long customerIdParam) {
        this.customerId = customerIdParam;
    }


}
