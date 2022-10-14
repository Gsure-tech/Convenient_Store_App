package org.example.services;

import org.example.Exceptions.CashierNotHiredException;
import org.example.enums.Gender;
import org.example.enums.Grade;
import org.example.enums.Qualifications;
import org.example.models.Applicant;
import org.example.models.Cashier;
import org.example.models.Manager;
import org.junit.Assert;
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

       applicant = new Applicant("07079e4094","Simon Moses", Gender.MALE,"No 4 Madunga Road",
               3323,Qualifications.BSC,Grade.FIRST_CLASS);
        cashier2 = new Cashier();
        manager = new Manager("0705466334","General Ibibio",Gender.MALE,"OKhuromi",3244);

        managerService= new ManagerService(manager);;
    }
@Test
    public void managerShouldHireCashier() throws CashierNotHiredException {

    Assert.assertEquals(applicant,managerService.hireCashier(applicant));
}
    @Test
    public void managerShouldFireCashier(){
        assertEquals("Cashier is fired because of his grade is " + cashier2.getGrade(),
                managerService.fireCashier(cashier2));
    }
}