package bcc.kz.legasy.schoolmiras.controller;

import bcc.kz.legasy.schoolmiras.model.Staff;
import bcc.kz.legasy.schoolmiras.model.Users;
import bcc.kz.legasy.schoolmiras.service.StaffService;
import bcc.kz.legasy.schoolmiras.service.UsersService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/staff", produces = APPLICATION_JSON_VALUE)
public class StaffController {
    @Autowired
    private StaffService staffService;

    @ApiOperation(value = "Get All staff")
    @GetMapping("/all")
    public ResponseEntity<List<Staff>> getAll() {
        return ResponseEntity.ok(staffService.getAll());
    }

    @ApiOperation(value = "Create or update staff object")
    @PostMapping()
    public ResponseEntity<Staff> calculateTestObject(@RequestBody Staff staff) {
        return ResponseEntity.ok(staffService.create(staff));
    }
    @ApiOperation(value = "Get id staff")
    @GetMapping("/id/{id}")
    public ResponseEntity<Staff> getStaffById(@PathVariable Integer id) {
        return ResponseEntity.ok(staffService.getById(id));
    }
    @ApiOperation(value = "Delete staff by id")
    @DeleteMapping("/id/{id}")
    public ResponseEntity<String> deleteStaffById(@PathVariable Integer id) {
        staffService.delete(id);
        return ResponseEntity.ok("Staff by" + id + " was deleted!!!");
    }
}
