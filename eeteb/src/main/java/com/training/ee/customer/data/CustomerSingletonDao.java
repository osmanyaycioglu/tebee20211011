package com.training.ee.customer.data;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.transaction.Transactional;

import com.training.ee.customer.service.models.CustomerInternal;

@Stateless
@LocalBean
@TransactionManagement(TransactionManagementType.BEAN)
public class CustomerSingletonDao {

    @PersistenceUnit(unitName = "eeteb")
    private EntityManagerFactory emf;

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
        EntityManager em = this.emf.createEntityManager();
        em.joinTransaction();
        try {
            em.persist(customerParam);
        } catch (Exception eLoc) {

        } finally {
            em.close();
        }
    }

}
