package com.microservice.appointment.client;
import com.microservice.appointment.dto.DoctorDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "msvc-doctor")
public interface DoctorClient {
    @GetMapping("/api/v1/doctors/{id}")
    DoctorDTO findDoctorById(@PathVariable Long id);
}
