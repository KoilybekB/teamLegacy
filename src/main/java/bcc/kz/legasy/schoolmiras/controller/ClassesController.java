package bcc.kz.legasy.schoolmiras.controller;

import bcc.kz.legasy.schoolmiras.model.Classes;
import bcc.kz.legasy.schoolmiras.model.Roles;
import bcc.kz.legasy.schoolmiras.service.ClassesService;
import bcc.kz.legasy.schoolmiras.service.RolesService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/classes", produces = APPLICATION_JSON_VALUE)
public class ClassesController {
    @Autowired
    private ClassesService classesService;

    @ApiOperation(value = "Get All classes")
    @GetMapping("/all")
    public ResponseEntity<List<Classes>> getAll() {
        return ResponseEntity.ok(classesService.getAll());
    }

    @ApiOperation(value = "Create or update classes object")
    @PostMapping()
    public ResponseEntity<Classes> calculateTestObject(@RequestBody Classes classes) {
        return ResponseEntity.ok(classesService.create(classes));
    }

    @ApiOperation(value = "Get id classes")
    @GetMapping("/id/{id}")
    public ResponseEntity<Classes> getClassesById(@PathVariable Integer id) {
        return ResponseEntity.ok(classesService.getById(id));
    }

    @ApiOperation(value = "Delete classes by id")
    @DeleteMapping("/id/{id}")
    public ResponseEntity<String> deleteClassesById(@PathVariable Integer id) {
        classesService.delete(id);
        return ResponseEntity.ok("Class by" + id + " was deleted!!!");
    }
}
