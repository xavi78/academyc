package com.javierrodriguez.academyc.app.application.Services.Impl;

import com.javierrodriguez.academyc.app.application.Services.ITeacherService;
import com.javierrodriguez.academyc.teachers.domain.entities.Teacher;
import com.javierrodriguez.academyc.teachers.infraestructure.persistence.Repository.ITeacherDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class TeacherServiceImpl implements ITeacherService {

    private static final Log logger =  LogFactory.getLog("DoctorServiceImpl.class");
    @Autowired
    private ITeacherDao teacherDao;



    @Override
    public void saveTeacher(Teacher teacher) {
                teacherDao.save(teacher);
    }
}
