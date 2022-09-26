package org.example.interfaces;

import org.example.models.Applicant;
import org.example.models.Cashier;

public interface ManagerInterface {
    Applicant hireCashier(Applicant applicant);
    String fireCashier(Cashier cashier);
}
