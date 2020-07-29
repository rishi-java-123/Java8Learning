package com.solid.hr.framework.personnel;

public
class ServiceLicenseAgreement {
    private int minUptimepercent;
    private int problemResolutionTimeDays;

    public
    ServiceLicenseAgreement ( int minUptimepercent , int problemResolutionTimeDays ) {
        this.minUptimepercent = minUptimepercent;
        this.problemResolutionTimeDays = problemResolutionTimeDays;
    }

    public
    int getMinUptimepercent ( ) {
        return minUptimepercent;
    }

    public
    int getProblemResolutionTimeDays ( ) {
        return problemResolutionTimeDays;
    }
}
