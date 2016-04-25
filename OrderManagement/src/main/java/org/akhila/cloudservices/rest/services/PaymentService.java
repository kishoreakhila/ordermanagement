package org.akhila.cloudservices.rest.services;

import net.sf.json.JSONArray;
import org.akhila.cloudservices.rest.model.Payment;

public interface PaymentService {
    public Payment getOrderByCustomerNumberAndCheckNumber(int customerNumber, String checkNumber);
    public JSONArray getAllPayments();
}
