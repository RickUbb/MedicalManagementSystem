package com.microservice.billing.persistence;

import com.microservice.billing.entities.Bill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillRepository extends CrudRepository<Bill, Long> {
    List<Bill> findByPatientId(Long patientId);
    List<Bill> findByAppointmentId(Long idAppointment);
}
