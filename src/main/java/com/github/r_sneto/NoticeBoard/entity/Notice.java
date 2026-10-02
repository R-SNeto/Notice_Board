package com.github.r_sneto.NoticeBoard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "notice")
public class Notice implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private LocalDate publicationDate;

    public Notice() {
    }

    public Notice(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.publicationDate = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

}
