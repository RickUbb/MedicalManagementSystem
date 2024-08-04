package com.microservice.billing.controller;

import com.microservice.billing.entities.Bill;
import com.microservice.billing.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bills")
public class BillController {
    @Autowired
    private BillService billService;

    @GetMapping
    public ResponseEntity<List<Bill>> findAllBills() {
        return ResponseEntity.ok(billService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bill> findById(@PathVariable Long id) {
        return ResponseEntity.ok(billService.findById(id));
    }

    @PostMapping("/crear")
    @ResponseStatus
    public void saveBill(@RequestBody Bill bill) {
        billService.save(bill);
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<Bill> updateBill(@RequestBody Bill bill, @PathVariable Long id) {
        bill.setId(id);
        billService.save(bill);
        return ResponseEntity.ok(bill);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> deleteBill(@PathVariable Long id) {
        billService.deleteById(id);
        return ResponseEntity.ok("Bill deleted");
    }

    @GetMapping("/patient/{patientId}")
    public ResponseEntity<List<Bill>> findByPatientId(@PathVariable Long patientId) {
        return ResponseEntity.ok(billService.findByPatientId(patientId));
    }

    @GetMapping("/appointment/{idAppointment}")
    public ResponseEntity<List<Bill>> findByAppointmentId(@PathVariable Long idAppointment) {
        return ResponseEntity.ok(billService.findByAppointmentId(idAppointment));
    }
}
