package com.spring.jpa.user.bussiness.service;

import com.spring.jpa.user.domain.model.ModalUser;

import java.util.List;

public interface ServiceUser {
List<ModalUser> findUsers();
void  saveUser(ModalUser user);

}
