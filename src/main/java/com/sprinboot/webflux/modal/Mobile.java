package com.sprinboot.webflux.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "mobile")
public class Mobile implements Serializable {
    @Id
    private int mobileId;
    private String name;
    private String brand;
    private String description;
    private String imei;

    public Mobile(int mobileId, String name, String brand, String description, String imei) {
        this.mobileId = mobileId;
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.imei = imei;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                ", imei='" + imei + '\'' +
                '}';
    }
}
