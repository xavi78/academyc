package com.javierrodriguez.academyc.teachers.ui;


import com.javierrodriguez.academyc.teachers.application.services.ITeacherService;
import com.javierrodriguez.academyc.teachers.domain.entities.Teacher;
import com.javierrodriguez.academyc.teachers.infraestructure.persistence.Repository.ITeacherDao;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("teachers")
public class TeacherController {

    private static final org.apache.commons.logging.Log logger = LogFactory.getLog("TeacherController.class");

    @Autowired
    private ITeacherService teacherService;

    @RequestMapping(value="", method= RequestMethod.GET, produces="application/json")
    public ResponseEntity<Void> home()
    {
      return new ResponseEntity("Es una prueba", HttpStatus.OK);
    }

    @RequestMapping(value="", method= RequestMethod.POST, produces ="application/json")
    public ResponseEntity<Teacher> saveTeacher(@RequestBody Teacher teacher, UriComponentsBuilder builder)
    {
        logger.debug("teacher ->"+ teacher);
        Teacher result = teacherService.saveTeacher(teacher);
        return new ResponseEntity(result, HttpStatus.OK);
    }

}
