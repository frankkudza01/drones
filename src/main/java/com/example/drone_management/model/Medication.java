package com.example.drone_management.model;

import javax.swing.*;

public class Medication {
    private String medicationName;
    private Double weight;
    private String code;
    private String image;

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

    public Medication(String medicationName, Double weight, String code, String image) {
        this.medicationName = medicationName;
        this.weight = weight;
        this.code = code;
        this.image = image;
    }
}
