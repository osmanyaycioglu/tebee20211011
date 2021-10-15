package com.training.ee.customer.data;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.training.ee.customer.service.models.CustomerInternal;

@Stateless
@LocalBean
@TransactionManagement(TransactionManagementType.BEAN)
public class CustomerDao {

    @PersistenceContext(unitName = "eeteb")
    private EntityManager em;

    //    public void addPure(final CustomerInternal customerParam) {
    //        this.em.getTransaction()
    //               .begin();
    //        try {
    //            this.em.persist(customerParam);
    //            this.em.getTransaction()
    //                   .commit();
    //        } catch (Exception eLoc) {
    //            this.em.getTransaction()
    //                   .rollback();
    //        }
    //    }

    @Transactional
    public void add(final CustomerInternal customerParam) {
        this.em.persist(customerParam);
    }

    @Transactional
    public void remove(final long cutomerId) {
        CustomerInternal customerInternalLoc = new CustomerInternal();
        customerInternalLoc.setCustomerId(cutomerId);
        this.em.remove(customerInternalLoc);
    }

    @Transactional
    public void update(final CustomerInternal customerParam) {
        if (!this.em.contains(customerParam)) {
            CustomerInternal mergeLoc = this.em.merge(customerParam);
        }
    }

    public CustomerInternal getOne(final long customerId) {
        return this.em.find(CustomerInternal.class,
                            customerId);
    }

    public List<CustomerInternal> getAll() {
        TypedQuery<CustomerInternal> createQueryLoc = this.em.createQuery("select c from CustomerInternal c",
                                                                          CustomerInternal.class);
        return createQueryLoc.getResultList();
    }

    public List<CustomerInternal> getByName(final String name) {
        TypedQuery<CustomerInternal> createQueryLoc = this.em.createQuery("select c from CustomerInternal c where c.name=:abc",
                                                                          CustomerInternal.class);
        createQueryLoc.setParameter("abc",
                                    name);
        return createQueryLoc.getResultList();
    }

    public List<CustomerInternal> getByNameNative(final String name) {
        Query createNativeQueryLoc = this.em.createNativeQuery("select * from customer_internal c where c.name=:abc",
                                                               CustomerInternal.class);
        createNativeQueryLoc.setParameter("abc",
                                          name);
        return createNativeQueryLoc.getResultList();
    }


}
