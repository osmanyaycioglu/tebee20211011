package com.teb.training.java.atm.business;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

import com.teb.training.java.atm.models.Customer;

public interface ICustomerProcess {

    Supplier<String> menuProvider();

    BiConsumer<Customer, Scanner> customerTask();

}
