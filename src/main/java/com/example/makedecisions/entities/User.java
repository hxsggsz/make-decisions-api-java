package com.example.makedecisions.entities;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.List;

@Document
public class User {
    @Id
    private String id;
//    private String create;
    private List<Options> options;

    public User(String id, List<Options> options) {
        this.id = id;
        this.options = options;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Options> getOptions() {
        return options;
    }

    public void setOptions(List<Options> options) {
        this.options = options;
    }

}
