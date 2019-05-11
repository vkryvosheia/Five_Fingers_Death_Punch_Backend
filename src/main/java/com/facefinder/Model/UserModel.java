package com.facefinder.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserModel {

    @Id
    @GeneratedValue
    private String id;

    private String firstName;

    private String lastName;

    private String photoUrl;


}
