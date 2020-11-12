package com.javierrodriguez.academyc.teachers.application.services.impl;

import com.javierrodriguez.academyc.app.application.services.IDniService;
import com.javierrodriguez.academyc.teachers.application.services.ITeacherService;
import com.javierrodriguez.academyc.teachers.domain.entities.Teacher;
import com.javierrodriguez.academyc.teachers.domain.entities.repositories.ITeacherRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeacherServiceImpl implements ITeacherService {

    private static final Log logger =  LogFactory.getLog("DoctorServiceImpl.class");
    @Autowired
    private ITeacherRepository teacherRepository;
    @Autowired
    private IDniService iDniService;


    @Override
    public Teacher saveTeacher(Teacher teacher) throws Exception {

       if(this.iDniService.checkDni(teacher.getDni())) {
            return teacherRepository.save(teacher);
       }else{

           throw new Exception("El dni es incorrecto");

       }


    }
}
