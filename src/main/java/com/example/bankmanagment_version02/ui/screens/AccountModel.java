package com.example.bankmanagment_version02.ui.screens;


import java.util.Objects;

public class AccountModel {
    private String name;
    private String email;
    private String phoneNo;
    private String address;
    private String firm;
    private String hairColor;
    private String eyeColor;
    private double height;
    private double weight;

    public AccountModel(String name, String email, String phoneNo, String address, String firm,
                        String hairColor, String eyeColor, double height, double weight) {
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.address = address;
        this.firm = firm;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.height = height;
        this.weight = weight;
    }

    public AccountModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isValid() {
        return !name.isEmpty() && !email.isEmpty() && !phoneNo.isEmpty() && !address.isEmpty() &&
                !firm.isEmpty() && !hairColor.isEmpty() && !eyeColor.isEmpty() && height > 0 && weight > 0;
    }

    @Override
    public String toString() {
        return "AccountModel{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", address='" + address + '\'' +
                ", firm='" + firm + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
