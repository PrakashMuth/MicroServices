package com.student.service.studentservice.Entity;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Student {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "first_name")
    private String FirstName;

    @Column(name = "last_name")
    private String LastName;

    @Column(name = "email")
    private String Email;

    public Student() {
    }

    public Student(String firstName, String lastName, String email) {
        FirstName = firstName;
        LastName = lastName;
        Email = email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName()
    {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
