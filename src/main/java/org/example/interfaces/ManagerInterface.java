package org.example.interfaces;

import org.example.Exceptions.CashierNotHiredException;
import org.example.models.Applicant;
import org.example.models.Cashier;

public interface ManagerInterface {
    Applicant hireCashier(Applicant applicant) throws CashierNotHiredException;
    String fireCashier(Cashier cashier);
}
