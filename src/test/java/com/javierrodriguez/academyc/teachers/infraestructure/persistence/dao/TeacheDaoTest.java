package com.javierrodriguez.academyc.teachers.infraestructure.persistence.dao;


import com.javierrodriguez.academyc.teachers.domain.entities.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.javierrodriguez.academyc.teachers.infraestructure.persistence.Repository.ITeacherDao;
import org.springframework.core.annotation.Order;

import java.util.Date;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
public class TeacheDaoTest {

    @Autowired
    private ITeacherDao teacherDao;

    @Test
    @Order(1)
    public void injectedComponentsAreNotNull()
    {
        assertThat(teacherDao).isNotNull();
    }

    @Test
    @Order(2)
    public void addTeacher(){

        UUID uuid = UUID.randomUUID();
        Teacher teacher = new Teacher(
                uuid,
                "Pepe",
                "Pepe");
        teacherDao.save(teacher);
        assertThat(teacher.getUuid().toString()).isEqualTo(uuid.toString());



    }




}
