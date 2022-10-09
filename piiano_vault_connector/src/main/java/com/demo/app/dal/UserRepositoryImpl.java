package com.demo.app.dal;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

    public List<User> findUserByEmail(String emailToken) {
        return em.createQuery(
                        "SELECT u FROM User u WHERE u.email = :emailToken", User.class)
                .setParameter("emailToken", emailToken)
                .getResultList();
    }
}
