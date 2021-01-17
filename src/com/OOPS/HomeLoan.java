package com.OOPS;

public class HomeLoan implements Loan {


    @Override
    public double getOutStanding(int Amount, double ROI) {

        double outStanding;

        outStanding = Amount * (ROI/100);

        return outStanding;
    }
}
