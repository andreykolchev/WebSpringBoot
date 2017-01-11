package com.model;

/**
 * Created by user on 28.12.16.
 */

import javax.persistence.*;

@Entity
@Table(name = "in_greeting")
public class Greeting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "content")
    private String content;

    public Greeting() {
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
