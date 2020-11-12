package com.javierrodriguez.academyc.teachers.domain.entities.repositories;

import com.javierrodriguez.academyc.teachers.domain.entities.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeacherRepository extends CrudRepository<Teacher, String> {
}
