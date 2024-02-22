package com.ford.creditcardsystem.entity;

import javax.annotation.processing.Generated;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Column(name = "cus_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cusId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "mail")
    private String mail;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "pincode")
    private String pincode;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "income")
    private String income;

    @Column(name = "gender")
    private String gender;

    @Column(name = "dob")
    private String dob;

    @Column(name = "education")
    private String education;

    public Customer() {
    }

    public Customer(Customer customer) {
        this.cusId = customer.getCusId();
        this.firstName = customer.getFirstName();
        this.lastName = customer.getLastName();
        this.mail = customer.getMail();
        this.phoneNumber = customer.getPhoneNumber();
        this.city = customer.getCity();
        this.state = customer.getState();
        this.pincode = customer.getPincode();
        this.userName = customer.getUserName();
        this.password = customer.getPassword();
        this.income = customer.getIncome();
        this.gender = customer.getGender();
        this.dob = customer.getDob();
        this.education = customer.getEducation();
    }


    public Long getCusId() {
        return this.cusId;
    }

    public void setCusId(Long cusId) {
        this.cusId = cusId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return this.pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIncome() {
        return this.income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return this.dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEducation() {
        return this.education;
    }

    public void setEducation(String education) {
        this.education = education;
    }



    
}
