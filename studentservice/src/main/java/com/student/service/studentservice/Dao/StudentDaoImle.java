package com.student.service.studentservice.Dao;


import com.student.service.studentservice.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class StudentDaoImle implements StudentDao
{
    private EntityManager entityManager;

    @Autowired
    public StudentDaoImle(EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> getname()
    {
        Query query=entityManager.createQuery("from Student");

        List<Student> students =query.getResultList();

        return students;
    }

    @Override
    public Student getStudent(int Id)
    {
       Student student=entityManager.find(Student.class,Id);

       return student;
    }
}
