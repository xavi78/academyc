package com.javierrodriguez.academyc.teachers.application.services.impl;

import com.javierrodriguez.academyc.teachers.application.services.ITeacherService;
import com.javierrodriguez.academyc.teachers.domain.entities.Teacher;
import com.javierrodriguez.academyc.teachers.domain.entities.repositories.ITeacherRepository;
import com.javierrodriguez.academyc.teachers.infraestructure.persistence.Repository.ITeacherDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements ITeacherService {

    private static final Log logger =  LogFactory.getLog("DoctorServiceImpl.class");
    @Autowired
    private ITeacherRepository teacherRepository;



    @Override
    public Teacher saveTeacher(Teacher teacher) {
                return teacherRepository.save(teacher);
    }
}
