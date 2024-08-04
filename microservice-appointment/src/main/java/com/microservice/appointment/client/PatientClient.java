package com.microservice.appointment.client;
import com.microservice.appointment.dto.PatientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "msvc-patient")
public interface PatientClient {
    @GetMapping("/api/v1/patients/{id}")
    PatientDTO findPatientById(@PathVariable Long id);
}
