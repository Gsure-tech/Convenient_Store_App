package org.example.services;

import org.example.Exceptions.CashierNotHiredException;
import org.example.enums.Gender;
import org.example.enums.Grade;
import org.example.enums.Qualifications;
import org.example.models.Applicant;
import org.example.models.Cashier;
import org.example.models.Manager;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.jupiter.api.Assertions.*;
//@RunWith(JUnit4.class)
class ManagerServiceTest {
    Cashier cashier2;
    Applicant applicant;
    Manager manager;
    ManagerService managerService;

    @BeforeEach
    public void setUp(){

       applicant = new Applicant(1,+234849473l, "Abdulganiyu", Gender.MALE,
                "No 2 college road",Qualifications.BSC, Grade.FIRST_CLASS);
        cashier2 = new Cashier(1,+234849473l, "Moses", Gender.FEMALE,
          "No 2 college road",Qualifications.BSC, Grade.FAIL);
        manager = new Manager(1,+2347063246807l, "Moses Simon",
                Gender.MALE,"Staff Quarters in staff road");

        managerService= new ManagerService(manager);;
    }
@Test
    public void managerShouldHireCashier() throws CashierNotHiredException {

    assertEquals(applicant,managerService.hireCashier(applicant));
}
    @Test
    public void managerShouldFireCashier(){

        assertEquals("Cashier is fired because of his grade is " + cashier2.getGrade(),
                managerService.fireCashier(cashier2));
    }
}