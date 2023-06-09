package com.example.bankmanagment_version02.data.model;

import java.io.Serializable;

public class AddBoxModel  implements Serializable {
    private String serialNumber;
    private Double height;
    private Double width;
    private Double oldPrice;
    private Double newPrice;

    public AddBoxModel(String serialNumber, Double height, Double width, Double oldPrice, Double newPrice) {
        this.serialNumber = serialNumber;
        this.height = height;
        this.width = width;
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
    }

    public AddBoxModel() {

    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public double getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(double newPrice) {
        this.newPrice = newPrice;
    }

    public boolean isValidBox() {
        // Check that all required fields are not empty or null
        if (serialNumber == null || serialNumber.isEmpty()
                || height <= 0
                || width <= 0
                || oldPrice < 0
                || newPrice < 0) {
            return false;
        }

        // Additional validation rules, if needed

        return true;
    }

    @Override
    public String toString() {
        return "AddBoxModel{" +
                "serialNumber='" + serialNumber + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", oldPrice=" + oldPrice +
                ", newPrice=" + newPrice +
                '}';
    }
}

