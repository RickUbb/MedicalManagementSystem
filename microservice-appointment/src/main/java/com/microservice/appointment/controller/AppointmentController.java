package com.microservice.appointment.controller;

import com.microservice.appointment.client.DoctorClient;
import com.microservice.appointment.client.PatientClient;
import com.microservice.appointment.dto.DoctorDTO;
import com.microservice.appointment.dto.PatientDTO;
import com.microservice.appointment.entities.Appointment;
import com.microservice.appointment.http.response.PatientByAppointmentResponse;
import com.microservice.appointment.service.AppointmentService;
import com.microservice.appointment.service.IAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {

    @Autowired
    private IAppointmentService appointmentService;

    @Autowired
    private PatientClient patientClient;

    @Autowired
    private DoctorClient doctorClient;

    @GetMapping
    public ResponseEntity<List<Appointment>> findAllAppointment() {
        return ResponseEntity.ok(appointmentService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<Appointment> findById(@PathVariable Long id) {
        return ResponseEntity.ok(appointmentService.findById(id));
    }

    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveAppointment(@RequestBody Appointment appointment) {
        appointmentService.save(appointment);
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<Appointment> updateAppointment(@RequestBody Appointment appointment, @PathVariable Long id) {
        appointment.setId(id);
        appointmentService.save(appointment);
        return ResponseEntity.ok(appointment);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> deleteAppointment(@PathVariable Long id) {
        appointmentService.deleteById(id);
        return ResponseEntity.ok("Appointment deleted");
    }

    @GetMapping("/details")
    public ResponseEntity<List<PatientByAppointmentResponse>> findAllAppointmentsWithDetails() {
        return ResponseEntity.ok(appointmentService.findAllAppointmentsWithDetails());
    }

    /*@GetMapping("/patient/{patientId}")
    public ResponseEntity<List<Appointment>> findAllByPatientId(@PathVariable Long patientId) {
        return ResponseEntity.ok(appointmentService.findAllByPatientId(patientId));
    }

    @GetMapping("/doctor/{doctorId}")
    public ResponseEntity<List<Appointment>> findAllByDoctorId(@PathVariable Long doctorId) {
        return ResponseEntity.ok(appointmentService.findAllByDoctorId(doctorId));
    }*/
}
