package com.example.resttemplate.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users", schema = "rest-template")
public class UserEntity {
    @Id
    private Integer userID;
    private String name;
    private String email;

    public UserEntity() {}

    public UserEntity(Integer userID, String name, String email) {
        this.userID = userID;
        this.name = name;
        this.email = email;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
