package bcc.kz.legasy.schoolmiras.controller;

import bcc.kz.legasy.schoolmiras.model.Roles;
import bcc.kz.legasy.schoolmiras.service.RolesService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/roles", produces = APPLICATION_JSON_VALUE)
public class RolesController {
    @Autowired
    private RolesService rolesService;

    @ApiOperation(value = "Get All roles")
    @GetMapping("/all")
    public ResponseEntity<List<Roles>> getAll() {
        return ResponseEntity.ok(rolesService.getAll());
    }

    @ApiOperation(value = "Create or update roles object")
    @PostMapping()
    public ResponseEntity<Roles> calculateTestObject(@RequestBody Roles roles) {
        return ResponseEntity.ok(rolesService.create(roles));
    }

    @ApiOperation(value = "Get id roles")
    @GetMapping("/id/{id}")
    public ResponseEntity<Roles> getRolesById(@PathVariable Integer id) {
        return ResponseEntity.ok(rolesService.getById(id));
    }

    @ApiOperation(value = "Delete role by id")
    @DeleteMapping("/id/{id}")
    public ResponseEntity<String> deleteRolesById(@PathVariable Integer id) {
        rolesService.delete(id);
        return ResponseEntity.ok("Role by" + id + " was deleted!!!");
    }
}
