package com.teb.training.java.atm.business;

import java.util.Scanner;

import com.teb.training.java.atm.models.Customer;

@FunctionalInterface
public interface ICustomerTask {

    void execute(Customer customerParam,
                 Scanner scannerParam);
}
