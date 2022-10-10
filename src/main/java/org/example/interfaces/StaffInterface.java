package org.example.interfaces;

import org.example.Exceptions.LeaveNotGrantedException;
import org.example.models.Leave;

public interface StaffInterface {
    String takeLeave(int startDay,int endDay) throws LeaveNotGrantedException;
}
