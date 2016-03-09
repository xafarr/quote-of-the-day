package com.performancecentre.domain;

import javax.persistence.*;

/**
 * Created by xafarr on 9/03/2016.
 */
@Entity
@Table(name = "quote")
public class Quote {

    @Id
    @GeneratedValue
    private Long id;

    private String author;
    private String topic;
    @Column(columnDefinition = "TEXT")
    private String quote;

    public Quote() { //for JPA
    }

    public Quote(String author, String topic, String quote) {
        this.author = author;
        this.topic = topic;
        this.quote = quote;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
