package org.example.services;

import org.example.Exceptions.LeaveNotGrantedException;
import org.example.models.Cashier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffServicesTest {
   Cashier cashier;
    StaffServices staffServices;
    @BeforeEach
    void setUp() {

      staffServices  = new StaffServices(cashier);
    }
    @Test
    void staffShouldTakeLeave() throws LeaveNotGrantedException {
        assertEquals("Leave granted",staffServices.takeLeave(31,1));
    }
}