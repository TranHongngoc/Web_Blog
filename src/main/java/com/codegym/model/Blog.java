package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "blog")
public class Blog {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String paragraph;

    public Blog() {
    }

    public Blog(Long id, String name, String paragraph) {
        this.id = id;
        this.name = name;
        this.paragraph = paragraph;
    }

    @Override
    public String toString() {
        return String.format("Blog[id=%d, name='%s', paragraph='%s']", id, name, paragraph);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParagraph() {
        return paragraph;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }
}
