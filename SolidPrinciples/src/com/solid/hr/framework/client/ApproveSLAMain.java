package com.solid.hr.framework.client;

import com.solid.hr.framework.personnel.ServiceLicenseAgreement;
import com.solid.hr.framework.personnel.Subcontractor;

import java.util.Arrays;
import java.util.List;

public
class ApproveSLAMain {
    public static void main(String[] args) {
        // Define SLA
        int minTimeOffPercent = 98;
        int maxResolutionDays = 2;
        ServiceLicenseAgreement companySla = new ServiceLicenseAgreement(
                minTimeOffPercent,
                maxResolutionDays);

        // Get collaborators from their own source
        Subcontractor subcontractor1 = new Subcontractor(
                "Rehan khan",
                "rehan-khan@abc.com",
                3000,
                15);
        Subcontractor subcontractor2 = new Subcontractor(
                "Harry potter",
                "harrypotter@def.com",
                3000, 15);
        List <Subcontractor> collaborators = Arrays.asList( subcontractor1, subcontractor2);

        // Check SLA
        for (Subcontractor s : collaborators) {
            s.approveSLA(companySla);
        }
    }
}
