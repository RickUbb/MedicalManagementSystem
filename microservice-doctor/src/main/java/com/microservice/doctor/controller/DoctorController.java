package com.microservice.doctor.controller;

import com.microservice.doctor.entities.Doctor;
import com.microservice.doctor.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public ResponseEntity<?> findAllDoctors() {
        return ResponseEntity.ok(doctorService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Doctor> findById(@PathVariable Long id) {
        return ResponseEntity.ok(doctorService.findById(id));
    }

    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveDoctor(@RequestBody Doctor doctor) {
        doctorService.save(doctor);
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<?> updateDoctor(@RequestBody Doctor doctor, @PathVariable Long id) {
        doctor.setId(id);
        doctorService.save(doctor);
        return ResponseEntity.ok(doctor);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> deleteDoctor(@PathVariable Long id) {
        doctorService.deleteById(id);
        return ResponseEntity.ok("Doctor deleted");
    }

}
