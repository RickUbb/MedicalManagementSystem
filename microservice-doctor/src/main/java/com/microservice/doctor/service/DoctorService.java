package com.microservice.doctor.service;

import com.microservice.doctor.entities.Doctor;
import com.microservice.doctor.persistence.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService implements IDoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public List<Doctor> findAll() {
        return (List<Doctor>) doctorRepository.findAll();
    }

    @Override
    public Doctor findById(Long id) {
        return doctorRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Doctor doctor) {
        doctorRepository.save(doctor);
    }

    @Override
    public void deleteById(Long id) {
        doctorRepository.deleteById(id);
    }
}
