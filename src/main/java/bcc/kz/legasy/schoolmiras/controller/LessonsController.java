package bcc.kz.legasy.schoolmiras.controller;

import bcc.kz.legasy.schoolmiras.model.Classes;
import bcc.kz.legasy.schoolmiras.model.Lessons;
import bcc.kz.legasy.schoolmiras.service.ClassesService;
import bcc.kz.legasy.schoolmiras.service.LessonsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/lessons", produces = APPLICATION_JSON_VALUE)
public class LessonsController {
    @Autowired
    private LessonsService lessonsService;

    @ApiOperation(value = "Get All lessons")
    @GetMapping("/all")
    public ResponseEntity<List<Lessons>> getAll() {
        return ResponseEntity.ok(lessonsService.getAll());
    }

    @ApiOperation(value = "Create or update lessons object")
    @PostMapping()
    public ResponseEntity<Lessons> calculateTestObject(@RequestBody Lessons lessons) {
        return ResponseEntity.ok(lessonsService.create(lessons));
    }

    @ApiOperation(value = "Get id lesson")
    @GetMapping("/id/{id}")
    public ResponseEntity<Lessons> getLessonsById(@PathVariable Integer id) {
        return ResponseEntity.ok(lessonsService.getById(id));
    }

    @ApiOperation(value = "Delete lessons by id")
    @DeleteMapping("/id/{id}")
    public ResponseEntity<String> deleteLessonsById(@PathVariable Integer id) {
        lessonsService.delete(id);
        return ResponseEntity.ok("Lesson by" + id + " was deleted!!!");
    }
}
