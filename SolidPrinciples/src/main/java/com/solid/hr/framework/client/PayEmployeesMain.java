package com.solid.hr.framework.client;

import com.solid.hr.framework.notification.EmailSender;
import com.solid.hr.framework.notification.EmployeeNotifier;
import com.solid.hr.framework.payement.PaymentProcessor;
import com.solid.hr.framework.persistence.EmployeeFileRepo;
import com.solid.hr.framework.persistence.EmployeeFileSerializer;
import com.solid.hr.framework.persistence.EmployeeRepo;

public class PayEmployeesMain {

    /*
    Will take a couple of seconds to execute due to the
    sending of mails.
     */

 /*   public static
    void main ( String[] args ) {
        PaymentProcessor paymentProcessor = new PaymentProcessor ( );
        int totalPayments = paymentProcessor.sendPayments ( );
        System.out.println ( "Total payments " + totalPayments );
    }*/

    public static void main(String[] args) {

        EmployeeFileSerializer serializer = new EmployeeFileSerializer();
        EmployeeRepo employeeRepository =
                new EmployeeFileRepo ( serializer);
        EmployeeNotifier employeeNotifier = new EmailSender ();
        PaymentProcessor paymentProcessor = new PaymentProcessor(
                employeeRepository,
                employeeNotifier);

        int totalPayments = paymentProcessor.sendPayments();
        System.out.println("Total payments " + totalPayments);
    }
}