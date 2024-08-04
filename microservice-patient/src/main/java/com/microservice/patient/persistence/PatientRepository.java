package com.microservice.patient.persistence;

import com.microservice.patient.entities.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Long> {

}
