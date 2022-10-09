package com.example.app.dal;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

    public List<User> findUserByEmail(String email) {
        return (List<User>) em.createNativeQuery(
                        "SELECT * FROM user u WHERE u.email_token = ?", User.class)
                .setParameter(1, email)
                .getResultList();
    }
}
