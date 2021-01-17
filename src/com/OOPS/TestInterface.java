package com.OOPS;

import com.intro.Inter;

public class TestInterface extends AutoLoan{

    public static void main(String[] args) {

        Loan homeLoan = new HomeLoan();

        double getInterest = homeLoan.getOutStanding(10000, 8.0);

        System.out.println(getInterest);

        Loan autoLoan = new AutoLoan();

        double getAutoInterest = autoLoan.getOutStanding(10000, 2.0);

        System.out.println(getAutoInterest);

        TestInterface autoLoan1 = new TestInterface();

       double i = autoLoan1.getOutStanding(10,5);

       System.out.println(i);

       autoLoan1.getNum(10.0,10.0);

       get();

    }

    @Override
    public double getOutStanding(int Amount, double ROI) {

        return Amount+ROI;
    }

    public static void get() {

        double d1 = 345624687575.0;

        int intteger = (int) d1;

        System.out.println(intteger);

    }


}
