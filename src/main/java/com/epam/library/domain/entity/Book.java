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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Book book = (Book) o;

        if (!title.equals(book.title)) return false;
        if (!author.equals(book.author)) return false;
        if (!brief.equals(book.brief)) return false;
        return publishYear.equals(book.publishYear);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + brief.hashCode();
        result = 31 * result + publishYear.hashCode();
        return result;
    }
}
