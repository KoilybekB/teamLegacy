package bcc.kz.legasy.schoolmiras.controller;


import bcc.kz.legasy.schoolmiras.model.Student;
import bcc.kz.legasy.schoolmiras.service.StudentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/student", produces = APPLICATION_JSON_VALUE)
public class StudentController {
    @Autowired
    private StudentService studentService;

    @ApiOperation(value = "Get All student")
    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAll() {
        return ResponseEntity.ok(studentService.getAll());
    }

    @ApiOperation(value = "Create or update student object")
    @PostMapping()
    public ResponseEntity<Student> calculateTestObject(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.create(student));
    }

    @ApiOperation(value = "Get id lesson")
    @GetMapping("/id/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Integer id) {
        return ResponseEntity.ok(studentService.getById(id));
    }

    @ApiOperation(value = "Delete student by id")
    @DeleteMapping("/id/{id}")
    public ResponseEntity<String> deleteStudentById(@PathVariable Integer id) {
        studentService.delete(id);
        return ResponseEntity.ok("Lesson by" + id + " was deleted!!!");
    }
}
