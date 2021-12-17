package com.agreeyaBasicsSpringboot.ModelPackage;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@Table(name="student_registeration")
public class StudentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer serialNo;

    @Column(name="studentName")
    private String name;

    @Column(name="address")
    private String address;

    @Column(name="city")
    private String city;

    @Column(name="country")
    private String Country;

    @Column(name="pincode")
    private Integer zipcode;
    public StudentInfo(){}
    public StudentInfo(Integer serialNo, String name, String address, String city, String country, Integer zipcode) {
        this.serialNo = serialNo;
        this.name = name;
        this.address = address;
        this.city = city;
        Country = country;
        this.zipcode = zipcode;
    }

    public Integer getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(Integer serialNo) {
        this.serialNo = serialNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "serialNo=" + serialNo +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", Country='" + Country + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}
