package com.spring.jpa.user.domain.dao;

import com.spring.jpa.user.domain.model.ModalUser;

import java.util.List;

public interface DaoUser {

    void saveUser(ModalUser user);
    List<ModalUser> findUsers();
}
