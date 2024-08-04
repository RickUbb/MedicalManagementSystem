package com.microservice.medicalrecord.service;

import com.microservice.medicalrecord.entities.MedicalRecord;

import java.util.List;

public interface IMedicalRecordService {
    List<MedicalRecord> findAll();
    MedicalRecord findById(Long id);
    void save(MedicalRecord medicalRecord);
    List<MedicalRecord> findByPatientId(Long patientId);
    List<MedicalRecord> findByDoctorId(Long doctorId);
    void deleteById(Long id);
}
