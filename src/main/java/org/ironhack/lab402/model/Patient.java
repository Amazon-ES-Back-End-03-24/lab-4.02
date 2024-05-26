package org.ironhack.lab402.model;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer patientId;

    private String name;

    private Date dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "admitted_by")
    private Doctor admittedBy;

    public Patient() {
    }

    public Patient(Integer patientId, String name, Date dateOfBirth, Doctor admittedBy) {
        this.patientId = patientId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.admittedBy = admittedBy;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Doctor getAdmittedBy() {
        return admittedBy;
    }

    public void setAdmittedBy(Doctor admittedBy) {
        this.admittedBy = admittedBy;
    }
}