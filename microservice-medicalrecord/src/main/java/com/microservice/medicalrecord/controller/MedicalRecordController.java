package com.microservice.medicalrecord.controller;

import com.microservice.medicalrecord.entities.MedicalRecord;
import com.microservice.medicalrecord.service.IMedicalRecordService;
import com.microservice.medicalrecord.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/medical-record")
public class MedicalRecordController {

    @Autowired
    private IMedicalRecordService medicalRecordService;

    @GetMapping
    public ResponseEntity<List<MedicalRecord>> findAllMedicalRecord() {
        return ResponseEntity.ok(medicalRecordService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<MedicalRecord> findById(@PathVariable Long id) {
        return ResponseEntity.ok(medicalRecordService.findById(id));
    }

    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveMedicalRecord(@RequestBody MedicalRecord medicalRecord) {
        medicalRecordService.save(medicalRecord);
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<MedicalRecord> updateMedicalRecord(@RequestBody MedicalRecord medicalRecord, @PathVariable Long id) {
        medicalRecord.setId(id);
        medicalRecordService.save(medicalRecord);
        return ResponseEntity.ok(medicalRecord);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> deleteMedicalRecord(@PathVariable Long id) {
        medicalRecordService.deleteById(id);
        return ResponseEntity.ok("Medical Record deleted");
    }

    @GetMapping("/patient/{patientId}")
    public ResponseEntity<List<MedicalRecord>> findByPatientId(@PathVariable Long patientId) {
        return ResponseEntity.ok(medicalRecordService.findByPatientId(patientId));
    }

    @GetMapping("/doctor/{doctorId}")
    public ResponseEntity<List<MedicalRecord>> findByDoctorId(@PathVariable Long doctorId) {
        return ResponseEntity.ok(medicalRecordService.findByDoctorId(doctorId));
    }

}
