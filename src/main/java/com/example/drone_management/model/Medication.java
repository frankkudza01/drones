package com.example.drone_management.model;

import javax.swing.*;

public class Medication {

    private String medicationId;
    private String medicationName;
    private Double weight;
    private String code;
    private String image;

    public String getMedicationId() {
        return medicationId;
    }

    public void setMedicationId(String medicationId) {
        this.medicationId = medicationId;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Medication() {
    }

    public Medication(String medicationId, String medicationName, Double weight, String code, String image) {
        this.medicationId=medicationId;
        this.medicationName = medicationName;
        this.weight = weight;
        this.code = code;
        this.image = image;
    }
}
