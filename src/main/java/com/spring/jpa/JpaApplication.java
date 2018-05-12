package com.spring.jpa;

import com.spring.jpa.user.bussiness.service.ServiceUser;
import com.spring.jpa.user.bussiness.service.ServiceUserImp;
import com.spring.jpa.user.domain.dao.DaoUserImpl;
import com.spring.jpa.user.domain.model.ModalUser;
import com.spring.jpa.user.domain.model.ModalUserImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaApplication {


    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
        ServiceUser  serviceUser = new ServiceUserImp();


        ModalUser user = new ModalUserImpl();
        user.setEmailAddress("HELLO PERSdsfIST");
        user.setPassword("xxxx");
        user.setUserName("SWSWsdSW");
        serviceUser.saveUser(user);
        serviceUser.findUsers();
    }




}
