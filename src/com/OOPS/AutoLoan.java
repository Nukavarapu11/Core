package com.OOPS;

public class AutoLoan implements Loan {

    public String s = "Hello";

    @Override
    public double getOutStanding(int Amount, double ROI) {

        double outStanding;

        outStanding = Amount * (ROI/100);

        return outStanding;
    }

    public int getNum(int a, int b) {
        return  0;
    }

    public static double getNum(double a, double b) {
        return 0.0;
    }

    private String getN() {
        return null;
    }
}
