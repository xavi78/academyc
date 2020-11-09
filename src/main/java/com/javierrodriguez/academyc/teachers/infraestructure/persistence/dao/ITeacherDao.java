package com.javierrodriguez.academyc.teachers.infraestructure.persistence.dao;

import com.javierrodriguez.academyc.teachers.domain.entities.Teacher;

public interface ITeacherDao {

    void save(Teacher teacher);
}
