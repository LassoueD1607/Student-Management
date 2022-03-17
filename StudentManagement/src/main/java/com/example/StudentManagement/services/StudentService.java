package com.example.StudentManagement.services;

import com.example.StudentManagement.entity.Student;
import com.example.StudentManagement.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    public Student saveStudent(Student student){

        return studentRepository.save(student);
    }
    public Student updateStudent(Student student){
        return studentRepository.save(student);

    }
    public Student getStudentById(Long id){
        return studentRepository.findById(id).get();
    }
    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }


}
