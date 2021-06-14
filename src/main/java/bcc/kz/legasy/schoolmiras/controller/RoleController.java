package bcc.kz.legasy.schoolmiras.controller;

import bcc.kz.legasy.schoolmiras.model.Role;
import bcc.kz.legasy.schoolmiras.service.RoleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value = "/api/private/v1/roles", produces = APPLICATION_JSON_VALUE)
public class RoleController {
    @Autowired
    private RoleService roleService;

    @ApiOperation(value = "Get All roles")
    @GetMapping("/all")
    public ResponseEntity<List<Role>> getAll() {
        return ResponseEntity.ok(roleService.getAll());
    }

    @ApiOperation(value = "Create or update roles object")
    @PostMapping()
    public ResponseEntity<Role> calculateTestObject(@RequestBody Role roles) {
        return ResponseEntity.ok(roleService.create(roles));
    }

    @ApiOperation(value = "Get id roles")
    @GetMapping("/id/{id}")
    public ResponseEntity<Role> getRolesById(@PathVariable Integer id) {
        return ResponseEntity.ok(roleService.getById(id));
    }

    @ApiOperation(value = "Delete role by id")
    @DeleteMapping("/id/{id}")
    public ResponseEntity<String> deleteRolesById(@PathVariable Integer id) {
        roleService.delete(id);
        return ResponseEntity.ok("Role by" + id + " was deleted!!!");
    }
}
