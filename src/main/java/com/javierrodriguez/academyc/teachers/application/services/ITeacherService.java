package com.javierrodriguez.academyc.teachers.application.services;

import com.javierrodriguez.academyc.teachers.domain.entities.Teacher;


public interface ITeacherService {

    Teacher saveTeacher(Teacher teacher) throws Exception;
}
