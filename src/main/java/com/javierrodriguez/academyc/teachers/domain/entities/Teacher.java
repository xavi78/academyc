package com.javierrodriguez.academyc.teachers.domain.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="teachers")
public class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "uuid", length = 16, unique = true, nullable = false)
    private UUID uuid = UUID.randomUUID();

    @NotEmpty
    private String name;

    @NotEmpty
    private String lastname;


    @NotNull
    @Column (name="created_at")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;


    @Column (name="updated_at")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;


    public Teacher(){
        super();
    }

    public Teacher(UUID uuid, @NotEmpty  String name, @NotEmpty  String LastName, @NotNull Date createdAt)
    {
        super();
        this.uuid = uuid;
        this.name = name;
        this.lastname=name;
        this.createdAt = createdAt;
    }

    public UUID uuid(){
        return uuid;
    }

    public String Name(){
        return name;
    }

    public Date CreatedAt(){
        return createdAt;
    }




}
