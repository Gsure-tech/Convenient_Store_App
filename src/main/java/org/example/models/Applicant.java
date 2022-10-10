package org.example.models;

import org.example.enums.Gender;
import org.example.enums.Grade;
import org.example.enums.Qualifications;

public class Applicant extends Person{
    private int applicantId;
    private Qualifications qualifications;
    private Grade grade;

    public Applicant() {
    }

    public Applicant(int applicantId, Qualifications qualifications, Grade grade) {
        this.applicantId = applicantId;
        this.qualifications = qualifications;
        this.grade = grade;
    }

    public Applicant(String phoneNumber, String fullName, Gender gender, String address, int applicantId, Qualifications qualifications, Grade grade) {
        super(phoneNumber, fullName, gender, address);
        this.applicantId = applicantId;
        this.qualifications = qualifications;
        this.grade = grade;
    }

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
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
                " id=" + applicantId +
                ", phoneNumber=" + getPhoneNumber() +
                ", fullName='" + getFullName() + '\'' +
                ", gender=" + getGender() +
                ", address='" + getAddress() + '\'' +
                "qualifications=" + qualifications +
                ", grade=" + grade +" " +
                "} " ;
    }
}
