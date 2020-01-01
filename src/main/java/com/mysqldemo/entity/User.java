package com.mysqldemo.entity;

import javax.persistence.*;

@Entity
@Table (name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String first_name;

    private String last_name;

    private String primary_mobile_number;

    private String primary_email;

    public User() {
    }

    public User(String first_name, String last_name, String primary_mobile_number, String primary_email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.primary_mobile_number = primary_mobile_number;
        this.primary_email = primary_email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPrimary_mobile_number() {
        return primary_mobile_number;
    }

    public void setPrimary_mobile_number(String primary_mobile_number) {
        this.primary_mobile_number = primary_mobile_number;
    }

    public String getPrimary_email() {
        return primary_email;
    }

    public void setPrimary_email(String primary_email) {
        this.primary_email = primary_email;
    }
}
