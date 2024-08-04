package com.microservice.medicalrecord.persistence;

import com.microservice.medicalrecord.entities.MedicalRecord;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MedicalRecordRepository extends CrudRepository<MedicalRecord, Long> {
    List<MedicalRecord> findByPatientId(Long patientId);
    List<MedicalRecord> findByDoctorId(Long doctorId);
}
