package com.github.r_sneto.NoticeBoard.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.io.Serializable;

@Entity
@DiscriminatorValue("Teacher")
public class Teacher extends User implements Serializable {

    private String registry;

    public Teacher() {
    }

    public Teacher(String name, String email, String password, String registry) {
        super(name, email, password);
        this.registry = registry;
    }

    public String getRegistry() {
        return registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }
}
