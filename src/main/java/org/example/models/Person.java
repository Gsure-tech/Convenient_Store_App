package org.example.models;

import org.example.enums.Gender;

public abstract class Person {
    private String fullName;
    private String phoneNumber;
    private Gender gender;
    private String address;


    public Person() {
    }

    public Person(String fullName,String phoneNumber,  Gender gender, String address) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "phoneNumber=" + phoneNumber +
                ", fullName='" + fullName + '\'' +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                '}';
    }
}
