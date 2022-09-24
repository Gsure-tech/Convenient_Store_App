package org.example.models;

import org.example.enums.Gender;
import org.example.enums.Grade;
import org.example.enums.Qualifications;
import org.example.interfaces.CashierInterface;

public class Cashier extends Staff{


    private Qualifications qualifications;
    private Grade grade;
    public Cashier() {
        super();
    }

    @Override
    public String toString() {
        return "Cashier{" +"id:" + getId() +" " + "PhoneNumber: " + getPhoneNumber() + " "
               +"FullName: "+ getFullName() + " "+ " Gender: " +getGender() + " "+
                 "Address: " + getAddress() +" " +
                "qualifications=" + qualifications +
                ", grade=" + grade +
                '}';


    }

    public Cashier(int id, long phoneNumber, String fullName, Gender gender, String address, Qualifications qualifications, Grade grade) {
        super(id, phoneNumber, fullName, gender, address);
        this.qualifications = qualifications;
        this.grade = grade;
    }

    public Cashier(Qualifications qualifications) {
        this.qualifications = qualifications;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Cashier(Qualifications qualifications, Grade grade) {
        this.qualifications = qualifications;
        this.grade = grade;
    }

    public Qualifications getQualifications() {
        return qualifications;
    }

    public void setQualifications(Qualifications qualifications) {
        this.qualifications = qualifications;
    }
}
