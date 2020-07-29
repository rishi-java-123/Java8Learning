package com.solid.hr.framework.personnel;

//can't extend employee class because it will break the LSP
public
class Subcontractor  {
    private String name;
    private String email;
    private int nbHoursPerWeek;
    private final int monthlyIncome;

    public
    Subcontractor ( String name , String email , int nbHoursPerWeek , int monthlyIncome ) {
        this.name = name;
        this.email = email;
        this.nbHoursPerWeek = nbHoursPerWeek;
        this.monthlyIncome = monthlyIncome;
    }

   public boolean approveSLA(ServiceLicenseAgreement sla){
        boolean result=false;
        if(sla.getMinUptimepercent () >=98 && sla.getProblemResolutionTimeDays () <= 2){
            result = true;
        }
       System.out.println("SLA approval for " + this.name + ": " + result);
       return result;
    }
}
