package com.training.ee.customer.service.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private Long   addressId;
    private String city;
    private String street;

    public String getCity() {
        return this.city;
    }

    public Address setCity(final String cityParam) {
        this.city = cityParam;
        return this;
    }

    public String getStreet() {
        return this.street;
    }

    public Address setStreet(final String streetParam) {
        this.street = streetParam;
        return this;
    }

    public Long getAddressId() {
        return this.addressId;
    }

    public void setAddressId(final Long addressIdParam) {
        this.addressId = addressIdParam;
    }


}
