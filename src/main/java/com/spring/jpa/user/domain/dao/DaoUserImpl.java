package com.spring.jpa.user.domain.dao;

import com.spring.jpa.user.domain.model.ModalUser;

import javax.persistence.*;
import java.util.List;

public class DaoUserImpl implements DaoUser {


    EntityManagerFactory factory = null;
    EntityManager em = null;
    EntityTransaction tx = null;

    public DaoUserImpl() {
        try {
            factory = Persistence
                    .createEntityManagerFactory("infinite-finances");
            em = factory.createEntityManager();
            tx = em.getTransaction();
            tx.begin();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Override
    public void saveUser(ModalUser user) {
        try {
            em.persist(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<ModalUser> findUsers() {
        Query query = null;
        try {
            query = em.createQuery("FROM ModalUserImpl ");
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
