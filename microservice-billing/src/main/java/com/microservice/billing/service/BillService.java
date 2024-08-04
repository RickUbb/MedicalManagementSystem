package com.microservice.billing.service;

import com.microservice.billing.entities.Bill;
import com.microservice.billing.persistence.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService implements IBillService {

    @Autowired
    private BillRepository billRepository;

    @Override
    public List<Bill> findAll() {
        return (List<Bill>) billRepository.findAll();
    }

    @Override
    public Bill findById(Long id) {
        return billRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Bill bill) {
        billRepository.save(bill);
    }

    @Override
    public void deleteById(Long id) {
        billRepository.deleteById(id);
    }

    @Override
    public List<Bill> findByPatientId(Long patientId) {
        return billRepository.findByPatientId(patientId);
    }

    @Override
    public List<Bill> findByAppointmentId(Long idAppointment) {
        return billRepository.findByAppointmentId(idAppointment);
    }


}
