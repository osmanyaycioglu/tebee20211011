package com.training.ee.customer.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;

import com.training.ee.customer.service.models.CustomerInternal;

@LocalBean
@Singleton
public class CustomerStorage {

    private final Map<String, CustomerInternal> customerCache = new ConcurrentHashMap<>();

    public void add(final CustomerInternal customerParam) {
        this.customerCache.put(customerParam.getUsername(),
                               customerParam);
    }

    public void remove(final String usernameParam) {
        this.customerCache.remove(usernameParam);
    }

    public void update(final CustomerInternal customerParam) {
        this.customerCache.put(customerParam.getUsername(),
                               customerParam);

    }

    public CustomerInternal getOne(final String usernameParam) {
        return this.customerCache.get(usernameParam);
    }

    public List<CustomerInternal> getAll() {
        return new ArrayList<>(this.customerCache.values());
    }


}
