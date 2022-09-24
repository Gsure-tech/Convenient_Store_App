package org.example.models;

import org.example.enums.Gender;

public abstract class Person {
    private int id;
    private long phoneNumber;
    private String fullName;
    private Gender gender;
    private String address;


//    public Person() {
//    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", phoneNumber=" + phoneNumber +
                ", fullName='" + fullName + '\'' +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                '}';
    }

    public Person(int id, long phoneNumber, String fullName, Gender gender, String address) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
    }

    public Person() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
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
}
