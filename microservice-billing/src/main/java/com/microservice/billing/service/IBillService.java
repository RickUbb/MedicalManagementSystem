package com.microservice.billing.service;

import com.microservice.billing.entities.Bill;

import java.util.List;

public interface IBillService {
    List<Bill> findAll();
    Bill findById(Long id);
    void save(Bill bill);
    List<Bill> findByPatientId(Long patientId);
    List<Bill> findByAppointmentId(Long idAppointment);
    void deleteById(Long id);

}
