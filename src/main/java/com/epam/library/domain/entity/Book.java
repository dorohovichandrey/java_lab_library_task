package com.epam.library.domain.entity;

import java.util.Date;

/**
 * Created by User on 14.03.2017.
 */
public class Book extends AbstractEntity<Integer> {

    private String title;
    private String author;
    private String brief;
    private Date publishYear;

    public Book() {
    }

    public Book(Integer id, String title, String author, String brief, Date publishYear) {
        super(id);
        this.title = title;
        this.author = author;
        this.brief = brief;
        this.publishYear = publishYear;
    }

    public Book(String title, String author, String brief, Date publishYear) {
        this.title = title;
        this.author = author;
        this.brief = brief;
        this.publishYear = publishYear;
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

    public Date getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Date publishYear) {
        this.publishYear = publishYear;
    }
}
