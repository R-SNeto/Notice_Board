package com.github.r_sneto.NoticeBoard.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.io.Serializable;

@Entity
@DiscriminatorValue("Student")
public class Student extends User implements Serializable {

    private String enrollment;

    public Student() {
    }

    public Student(String name, String email, String password, String enrollment) {
        super(name, email, password);
        this.enrollment = enrollment;
    }

    public String getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }
}
