package org.example.models;

import org.example.enums.Gender;
import org.example.enums.Grade;
import org.example.enums.Qualifications;

public class Applicant extends Person{
    private Qualifications qualifications;
    private Grade grade;

    public Applicant() {
    }

    public Applicant(int id, long phoneNumber, String fullName, Gender gender, String address, Qualifications qualifications, Grade grade) {
        super(id, phoneNumber, fullName, gender, address);
        this.qualifications = qualifications;
        this.grade = grade;
    }

    public Applicant(Qualifications qualifications, Grade grade) {
        this.qualifications = qualifications;
        this.grade = grade;
    }

    public Qualifications getQualifications() {
        return qualifications;
    }

    public void setQualifications(Qualifications qualifications) {
        this.qualifications = qualifications;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                " id=" + getId() +
                ", phoneNumber=" + getPhoneNumber() +
                ", fullName='" + getFullName() + '\'' +
                ", gender=" + getGender() +
                ", address='" + getAddress() + '\'' +
                "qualifications=" + qualifications +
                ", grade=" + grade +" " +
                "} " ;
    }
}
