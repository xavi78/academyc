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
    private String uuid = UUID.randomUUID().toString();

    @NotEmpty
    @Column (name="name")
    private String name;

    @NotEmpty
    @Column (name="lastname")
    private String lastname;


    @Column (name="dni")
    private String dni;


    @NotNull
    @Column (name="created_at")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt = new Date();



    @Column (name="updated_at")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;


    public Teacher(){
        super();
    }

    public Teacher(UUID uuid, @NotEmpty  String name, @NotEmpty  String lastname, String dni)
    {
        super();
        this.uuid = uuid.toString();
        this.name = name;
        this.lastname=lastname;
        this.dni = dni;
        this.createdAt = new Date();

    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDni() { return dni; }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }




}
