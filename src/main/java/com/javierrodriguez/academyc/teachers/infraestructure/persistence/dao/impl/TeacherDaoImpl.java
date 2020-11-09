package com.javierrodriguez.academyc.teachers.infraestructure.persistence.dao.impl;

import com.javierrodriguez.academyc.teachers.infraestructure.persistence.dao.ITeacherDao;
import com.javierrodriguez.academyc.teachers.domain.entities.Teacher;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class TeacherDaoImpl implements ITeacherDao {


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Teacher teacher) {
        entityManager.persist(teacher);
    }
}
