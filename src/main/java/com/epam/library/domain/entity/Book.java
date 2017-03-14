package com.epam.library.domain.entity;

import com.epam.library.domain.entity.AbstractEntity;

/**
 * Created by User on 14.03.2017.
 */
public class Book extends AbstractEntity<Integer> {

    private String title;
    private String author;
    private String brief;
    private Integer dateOfPublishing;

    public Book(Integer id, String title, String author, String brief, Integer dateOfPublishing) {
        super(id);
        this.title = title;
        this.author = author;
        this.brief = brief;
        this.dateOfPublishing = dateOfPublishing;
    }

    public Book(String title, String author, String brief, Integer dateOfPublishing) {
        this.title = title;
        this.author = author;
        this.brief = brief;
        this.dateOfPublishing = dateOfPublishing;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public Integer getDateOfPublishing() {
        return dateOfPublishing;
    }

    public void setDateOfPublishing(Integer dateOfPublishing) {
        this.dateOfPublishing = dateOfPublishing;
    }
}