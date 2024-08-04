package com.microservice.admin.controller;

import com.microservice.admin.entities.Admin;
import com.microservice.admin.service.AdminService;
import com.microservice.admin.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.relation.Role;

@RestController
@RequestMapping("/api/v1/admins")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping
    public ResponseEntity<?> findAllAdmins() {
        return ResponseEntity.ok(adminService.findAll());
    }

    @GetMapping("/all")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(adminService.findAll());
    }

    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveAdmin(@RequestBody Admin admin) {
        adminService.save(admin);
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<?> updateAdmin(@RequestBody Admin admin, @PathVariable Long id) {
        admin.setId(id);
        adminService.save(admin);
        return ResponseEntity.ok(admin);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> deleteAdmin(@PathVariable Long id) {
        adminService.deleteById(id);
        return ResponseEntity.ok("Admin deleted");
    }
}
