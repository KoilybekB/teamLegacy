package bcc.kz.legasy.schoolmiras.service.impl;

import bcc.kz.legasy.schoolmiras.model.Classes;
import bcc.kz.legasy.schoolmiras.model.Student;
import bcc.kz.legasy.schoolmiras.repository.ClassesRepository;
import bcc.kz.legasy.schoolmiras.repository.StaffRepository;
import bcc.kz.legasy.schoolmiras.repository.StudentRepository;
import bcc.kz.legasy.schoolmiras.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getById(Integer id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            return studentRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        Student student = getById(id);
        if (student != null)
            studentRepository.delete(student);
    }

}
