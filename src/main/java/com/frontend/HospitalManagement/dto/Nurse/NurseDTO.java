package com.frontend.HospitalManagement.dto.Nurse;

import lombok.Data;

@Data
public class NurseDTO {
    private String name;
    private String position;
    private boolean registered;
    private String availability;
    private Integer employeeId;
    private Integer ssn;
}