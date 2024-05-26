package org.ironhack.lab402.service;

import org.ironhack.lab402.enums.EmployeeStatus;
import org.ironhack.lab402.model.Patient;
import org.ironhack.lab402.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Date;
import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getPatients() {
        return patientRepository.findAll();
    }

    public Patient getPatientById(Integer id) {
        return patientRepository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Patient not found"));
    }

    public List<Patient> getByDateOfBirthBetween(Date start, Date end) {
        return patientRepository.findByDateOfBirthBetween(start, end);
    }

    public List<Patient> getByAdmittedByDepartment(String department) {
        return patientRepository.findByAdmittedByDepartment(department);
    }

    public List<Patient> getByAdmittedByStatus() {
        return patientRepository.findByAdmittedByStatus(EmployeeStatus.OFF);
    }
}
