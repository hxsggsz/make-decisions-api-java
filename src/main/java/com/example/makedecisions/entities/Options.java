package com.example.makedecisions.entities;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.time.OffsetDateTime;

@Document
public class Options {

    @Id
    private String id;
    private String list;

    public String getId() {
        return id;
    }

    public Options(String id, String list, OffsetDateTime createdAt) {
        this.id = id;
        this.list = list;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }
}
