package com.sample.ws.pojo;

import java.io.Serializable;

/**
 * User
 *
 * @author Aaric, created on 2020-09-04T11:27.
 * @version 0.1.0-SNAPSHOT
 */
public class User implements Serializable {

    private static final long serialVersionUID = 2801913261617778657L;

    private Long id;
    private String name;

    public User() {
    }

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
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
}
