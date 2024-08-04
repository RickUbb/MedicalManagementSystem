package com.microservice.patient.service;

import com.microservice.patient.entities.Patient;
import com.microservice.patient.persistence.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService implements IPatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<Patient> findAll() {
        return (List<Patient>) patientRepository.findAll();
    }

    @Override
    public Patient findById(Long id) {
        return patientRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Patient patient) {
        patientRepository.save(patient);
    }

    @Override
    public void deleteById(Long id) {
        patientRepository.deleteById(id);
    }
}