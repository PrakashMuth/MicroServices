package com.student.service.studentservice.Service;


import com.student.service.studentservice.Dao.StudentDao;
import com.student.service.studentservice.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImple implements StudentService
{
    @Autowired
    private StudentDao studentDao;

    @Override
    @Transactional
    public List<Student> getname()
    {
        return studentDao.getname();
    }

    @Override
    @Transactional
    public Student getStudent(int Id)
    {
        return studentDao.getStudent(Id);
    }
}
