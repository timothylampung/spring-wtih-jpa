package com.spring.jpa.user.bussiness.service;

import com.spring.jpa.user.domain.dao.DaoUser;
import com.spring.jpa.user.domain.dao.DaoUserImpl;
import com.spring.jpa.user.domain.model.ModalUser;

import java.util.List;

public class ServiceUserImp implements ServiceUser {

    DaoUser daoUser = new DaoUserImpl();


    @Override
    public List<ModalUser> findUsers() {
        return daoUser.findUsers();
    }

    @Override
    public void saveUser(ModalUser user) {
        daoUser.saveUser(user);
    }
}
