package com.javierrodriguez.academyc.teachers.infraestructure.persistence.Repository;

import com.javierrodriguez.academyc.teachers.domain.entities.Teacher;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
@Repository
public class TeacherDaoImpl implements ITeacherDao {


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Teacher teacher) {
        entityManager.persist(teacher);
    }
}
