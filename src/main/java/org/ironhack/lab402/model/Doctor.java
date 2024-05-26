package org.ironhack.lab402.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.ironhack.lab402.enums.EmployeeStatus;

import java.util.List;

@Entity
@Table(name = "doctors")
public class Doctor {
    @Id
    private String employeeId;

    private String department;

    private String name;

    @Enumerated(value = EnumType.STRING)
    private EmployeeStatus status;

    @OneToMany(mappedBy = "admittedBy")
    //@JsonIgnore is used to prevent this property from being included in the serialized JSON representation
    // so, for example, when you call in postman it doesn't have infinite recursion
    // (but also to prevent sensitive info to be shown, etc)
    @JsonIgnore
    private List<Patient> patients;

    public Doctor() {
    }

    public Doctor(String employeeId, String department, String name, EmployeeStatus status, List<Patient> patients) {
        this.employeeId = employeeId;
        this.department = department;
        this.name = name;
        this.status = status;
        this.patients = patients;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeStatus getStatus() {
        return status;
    }

    public void setStatus(EmployeeStatus status) {
        this.status = status;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
}
