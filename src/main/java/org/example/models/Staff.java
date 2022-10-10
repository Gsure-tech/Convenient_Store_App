package org.example.models;

import org.example.enums.Gender;

public abstract class Staff  extends Person{
    private int StaffId;
    public Staff() {
        super();
    }
    public Staff(int staffId) {
        StaffId = staffId;
    }

    public Staff(String phoneNumber, String fullName, Gender gender, String address, int staffId) {
        super(phoneNumber, fullName, gender, address);
        StaffId = staffId;
    }

    public int getStaffId() {
        return StaffId;
    }

    public void setStaffId(int staffId) {
        StaffId = staffId;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "StaffId=" + StaffId +
                "} " + super.toString();
    }


}
