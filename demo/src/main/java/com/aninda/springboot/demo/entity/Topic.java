package com.aninda.springboot.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

// import lombok.Getter;

// @Getter
@Entity
@Table(name = "TOPIC")
public class Topic {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID",nullable = false)
    protected int id;

    @Column(name="NAME",nullable = false)
    protected String name;

    @Column(name="DESCRIPTION")
    protected String description;

    @Column(name="CREATEDBY",nullable = false)
    protected String createdby = "Admin";

    @Column(name="CREATEDTIME", columnDefinition = "TIMESTAMP", insertable = false, updatable = false)
    @JsonFormat(shape = Shape.STRING, pattern = "MM-dd-yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdtime;

    @Column(name="UPDATEDBY")
    protected String updatedby;

    @Column(name="UPDATEDTIME", columnDefinition = "TIMESTAMP", insertable = true, updatable = true)
    @JsonFormat(shape = Shape.STRING, pattern = "MM-dd-yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedtime;

    public Topic() {
    }

    public Topic(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public String getUpdatedby() {
        return updatedby;
    }

    public void setUpdatedby(String updatedby) {
        this.updatedby = updatedby;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public Date getUpdatedtime() {
        return updatedtime;
    }

    public void setUpdatedtime(Date updatedtime) {
        this.updatedtime = updatedtime;
    }

    
}
