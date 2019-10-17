package com.student.service.studentservice.EmployeeController;



import com.student.service.studentservice.Entity.Student;
import com.student.service.studentservice.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController
{
    @Autowired
    private StudentService studentService;

    @GetMapping("/{hello}")
    public List<Student> findAll()
    {
        return studentService.getname();
    }

    @GetMapping("/hello/{Id}")
    public Student getLicensesWithClient(@PathVariable int Id)
    {
        Student student=studentService.getStudent(Id);
        return student;
    }
}
