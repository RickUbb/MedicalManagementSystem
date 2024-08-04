package com.microservice.appointment.persistence;

import com.microservice.appointment.entities.Appointment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, Long> {
    //List<Appointment> findAllByPatientId(Long patientId);
    //List<Appointment> findAllByDoctorId(Long doctorId);
}
