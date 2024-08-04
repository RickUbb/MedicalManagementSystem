package com.microservice.appointment.service;

import com.microservice.appointment.client.DoctorClient;
import com.microservice.appointment.client.PatientClient;
import com.microservice.appointment.dto.DoctorDTO;
import com.microservice.appointment.dto.PatientDTO;
import com.microservice.appointment.entities.Appointment;
import com.microservice.appointment.http.response.PatientByAppointmentResponse;
import com.microservice.appointment.persistence.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AppointmentService implements IAppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;
    @Autowired
    private PatientClient patientClient;
    @Autowired
    private DoctorClient doctorClient;

    @Override
    public List<Appointment> findAll() {
        return (List<Appointment>) appointmentRepository.findAll();
    }

    @Override
    public Appointment findById(Long id) {
        return appointmentRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Appointment appointment) {
        appointmentRepository.save(appointment);
    }

    @Override
    public void deleteById(Long id) {
        appointmentRepository.deleteById(id);
    }

    @Override
    public List<PatientByAppointmentResponse> findAllAppointmentsWithDetails() {
        return appointmentRepository.findAll().forEach().map(appointment -> {
            PatientDTO patient = patientClient.findPatientById(appointment.getPatientId());
            DoctorDTO doctor = doctorClient.findDoctorById(appointment.getIdDoctor());
            return PatientByAppointmentResponse.builder()
                    .appointmentReason(appointment.getReason())
                    .appointmentDate(appointment.getAppointmentDate().toString())
                    .patient(patient)
                    .doctor(doctor)
                    .build();
        }).collect(Collectors.toList());
    }

    /*@Override
    public List<Appointment> findAllByPatientId(Long patientId) {
        return appointmentRepository.findAllByPatientId(patientId);
    }

    @Override
    public List<Appointment> findAllByDoctorId(Long doctorId) {
        return appointmentRepository.findAllByDoctorId(doctorId);
    }*/
}