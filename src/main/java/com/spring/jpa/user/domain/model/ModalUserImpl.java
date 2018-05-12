package com.spring.jpa.user.domain.model;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class ModalUserImpl implements ModalUser {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "USER_ID")
    long userId;

    @Column(name="USER_NAME")
    String userName;

    @Column(name="EMAIL_ADDRESS")
    String emailAddress;

    @Column(name="PASSWORD")
    String password;


    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String getUserName() {
        return this.userName;
    }

    @Override
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String getEmailAddress() {
        return this.emailAddress;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return this.password;
    }
}
