package com.example.app.dal;

import java.util.List;

public interface UserRepositoryCustom {
    List<User> findUserByEmail(String email);
}
