package com.frontend.HospitalManagement.dto.Nurse;

import java.util.List;

public class NursePageResponse {

    private List<NurseDTO> nurses;
    private int totalPages;

    public List<NurseDTO> getNurses() {
        return nurses;
    }

    public void setNurses(List<NurseDTO> nurses) {
        this.nurses = nurses;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}