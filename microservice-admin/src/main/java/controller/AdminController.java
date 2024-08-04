package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.IAdminService;
import entities.Admin;

@RestController
@RequestMapping("/api/v1/admins")
public class AdminController {

    @Autowired
    private IAdminService adminService;

    @GetMapping
    public ResponseEntity<?> findAllAdmins() {
        return ResponseEntity.ok(adminService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(adminService.findById(id));
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveAdmin(@RequestBody Admin admin) {
        adminService.save(admin);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateAdmin(@RequestBody Admin admin, @PathVariable Long id) {
        admin.setId(id);
        adminService.save(admin);
        return ResponseEntity.ok(admin);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteAdmin(@PathVariable Long id) {
        adminService.deleteById(id);
        return ResponseEntity.ok("Admin deleted");
    }
}