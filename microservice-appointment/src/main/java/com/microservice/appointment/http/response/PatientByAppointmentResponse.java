package com.microservice.appointment.http.response;

import com.microservice.appointment.dto.DoctorDTO;
import com.microservice.appointment.dto.PatientDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PatientByAppointmentResponse {
    private String appointmentReason;
    private String appointmentDate;
    private PatientDTO patient;
    private DoctorDTO doctor;
}
