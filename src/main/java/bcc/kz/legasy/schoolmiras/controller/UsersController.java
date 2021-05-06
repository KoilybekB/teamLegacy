package bcc.kz.legasy.schoolmiras.controller;

import bcc.kz.legasy.schoolmiras.model.Roles;
import bcc.kz.legasy.schoolmiras.model.Users;
import bcc.kz.legasy.schoolmiras.service.RolesService;
import bcc.kz.legasy.schoolmiras.service.UsersService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/users", produces = APPLICATION_JSON_VALUE)
public class UsersController {
    @Autowired
    private UsersService usersService;

    @ApiOperation(value = "Get All users")
    @GetMapping("/all")
    public ResponseEntity<List<Users>> getAll() {
        return ResponseEntity.ok(usersService.getAll());
    }

    @ApiOperation(value = "Create or update users object")
    @PostMapping()
    public ResponseEntity<Users> calculateTestObject(@RequestBody Users users) {
        return ResponseEntity.ok(usersService.create(users));
    }
    @ApiOperation(value = "Get id users")
    @GetMapping("/id/{id}")
    public ResponseEntity<Users> getUsersById(@PathVariable Integer id) {
        return ResponseEntity.ok(usersService.getById(id));
    }
    @ApiOperation(value = "Delete user by id")
    @DeleteMapping("/id/{id}")
    public ResponseEntity<String> deleteUsersById(@PathVariable Integer id) {
        usersService.delete(id);
        return ResponseEntity.ok("User by" + id + " was deleted!!!");
    }
}
