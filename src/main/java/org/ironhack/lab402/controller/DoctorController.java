package org.ironhack.lab402.controller;

import org.ironhack.lab402.enums.EmployeeStatus;
import org.ironhack.lab402.model.Doctor;
import org.ironhack.lab402.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Doctor> getDoctors(@RequestParam Optional<EmployeeStatus> status, @RequestParam Optional<String> department) {
        return doctorService.getDoctors(status, department);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Doctor getById(@PathVariable String id) {
        return doctorService.getDoctorById(id);
    }
}
