package com.microservice.doctor.service;

import com.microservice.doctor.entities.Doctor;

import java.util.List;

public interface IDoctorService {
    List<Doctor> findAll();
    Doctor findById(Long id);
    void save(Doctor doctor);
    void deleteById(Long id);
}
