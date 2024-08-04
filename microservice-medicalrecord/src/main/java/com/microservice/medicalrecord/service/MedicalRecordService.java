package com.microservice.medicalrecord.service;

import com.microservice.medicalrecord.entities.MedicalRecord;
import com.microservice.medicalrecord.persistence.MedicalRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalRecordService implements IMedicalRecordService {

    @Autowired
    private MedicalRecordRepository medicalRecordRepository;

    @Override
    public List<MedicalRecord> findAll() {
        return (List<MedicalRecord>) medicalRecordRepository.findAll();
    }

    @Override
    public MedicalRecord findById(Long id) {
        return medicalRecordRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(MedicalRecord medicalRecord) {
        medicalRecordRepository.save(medicalRecord);
    }

    @Override
    public void deleteById(Long id) {
        medicalRecordRepository.deleteById(id);
    }

    @Override
    public List<MedicalRecord> findByPatientId(Long patientId) {
        return medicalRecordRepository.findByPatientId(patientId);
    }

    @Override
    public List<MedicalRecord> findByDoctorId(Long doctorId) {
        return medicalRecordRepository.findByDoctorId(doctorId);
    }

}
