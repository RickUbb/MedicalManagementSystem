package com.microservice.patient.service;

import com.microservice.patient.entities.Patient;

import java.util.List;

public interface IPatientService {
    List<Patient> findAll();
    Patient findById(Long id);
    void save(Patient patient);
    void deleteById(Long id);
}