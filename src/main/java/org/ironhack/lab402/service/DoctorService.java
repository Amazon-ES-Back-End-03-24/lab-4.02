package org.ironhack.lab402.service;

import org.ironhack.lab402.enums.EmployeeStatus;
import org.ironhack.lab402.model.Doctor;
import org.ironhack.lab402.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getDoctors(Optional<EmployeeStatus> status, Optional<String> department) {
        if (status.isPresent() && department.isPresent()) {
            return doctorRepository.findByDepartmentAndStatus(department.get(), status.get());
        } else if (status.isPresent()) {
            return doctorRepository.findByStatus(status.get());
        } else if (department.isPresent()) {
            return doctorRepository.findByDepartment(department.get());
        } else {
            return doctorRepository.findAll();
        }
    }

    public Doctor getDoctorById(String id) {
        return doctorRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Doctor not found"));
    }
}
