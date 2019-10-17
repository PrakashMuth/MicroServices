package com.student.service.studentservice.Dao;

import com.student.service.studentservice.Entity.Student;

import java.util.List;

public interface StudentDao
{
    public List<Student> getname();

    public Student getStudent(int Id);
}
