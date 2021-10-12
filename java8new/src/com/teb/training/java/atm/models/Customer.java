package com.teb.training.java.atm.models;


public class Customer {

    private String username;
    private String password;
    private String name;
    private String surname;
    private int    amount;

    public String getUsername() {
        return this.username;
    }

    public Customer setUsername(final String usernameParam) {
        this.username = usernameParam;
        return this;
    }

    public int getAmount() {
        return this.amount;
    }

    public Customer setAmount(final int amountParam) {
        this.amount = amountParam;
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


}
